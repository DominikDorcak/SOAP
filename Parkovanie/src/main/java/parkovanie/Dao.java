package parkovanie;

import org.sql2o.Connection;
import org.sql2o.Sql2o;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


public class Dao {

    private  Sql2o sql2o;

    public Dao() {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver ());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        sql2o = new Sql2o("jdbc:mysql://localhost:3306/parkovanie", "root", "Zbince149");
    }

    public  Listok insertListok(String ecv, long parkoviskoID) {
        Listok listok = new Listok(ecv, parkoviskoID);

        String sql =
                "insert into Listok(ecv,Parkovisko_id,prichod) values (:ecv,:Parkovisko_id,:prichod)";

        Connection con;
        try {
            con = sql2o.open();
            long insertedId = con.createQuery(sql, true)
                    .addParameter("ecv", listok.getEcv())
                    .addParameter("Parkovisko_id", listok.getParkovisko_id())
                    .addParameter("prichod", listok.getPrichod())
                    .executeUpdate()
                    .getKey(Long.class);
            listok.setID(insertedId);
            con.close();
        } catch (Exception e) {
            System.err.println("chyba insert listok");
            e.printStackTrace();
        }

        sql = "update parkovisko set obsadene = obsadene + 1 where id = :id";

        try {
            con = sql2o.open();
            con.createQuery(sql).addParameter("id",parkoviskoID)
                    .executeUpdate();
            con.close();
        } catch (Exception e) {
            System.err.println("chyba update obsadenost");
            e.printStackTrace();
        }

        return listok;
    }

    public List<Listok> getListokDnes(long parkovisko) {
        long[] polnoci = polnoci();

        String sql =
                "SELECT id, ecv, Parkovisko_id, prichod, odchod FROM listok where (Parkovisko_id = "
                        + parkovisko + ") and (prichod between " + polnoci[0]+ " and " + polnoci[1] + ")" +
                        "and (odchod is not null)"+
                        "and (odchod between " + polnoci[0]+ " and " + polnoci[1] + ")";


        Connection con;
        try {
            con = sql2o.open();
            return con.createQuery(sql).executeAndFetch(Listok.class);
        } catch (Exception e) {
            return null;
        }
    }

    public Listok getListok(long id) {
        String sql =
                "SELECT id, ecv, Parkovisko_id, prichod, odchod FROM listok where id = " + id;


        Connection con;
        try {
            con = sql2o.open();
            return con.createQuery(sql).executeAndFetch(Listok.class).get(0);
        } catch (Exception e) {
            return null;
        }
    }

    public  boolean ukonciListok(long listokID) {
        Connection con;
        Listok listok = getListok(listokID);
        //System.out.println(listok.getOdchod());
        if(listok.getOdchod()==0){

        long odchod = System.currentTimeMillis();
        String sql = "update listok set odchod = :odchod where id = " + listokID ;


        try {
            con = sql2o.open();
            con.createQuery(sql)
                    .addParameter("odchod", odchod)
                    .executeUpdate();
            con.close();
        } catch (Exception e) {
            return false;
        }
        sql = "update parkovisko set obsadene = obsadene-1 where id = :id";

        try {
            con = sql2o.open();
            con.createQuery(sql)
                    .addParameter("id",listok.getParkovisko_id())
                    .executeUpdate();
            con.close();
        } catch (Exception e) {
            System.err.println("chyba update obsadenost");
            e.printStackTrace();
        }

        return true;
        }else
            return false;
    }

    public  List<Parkovisko> getParkovisko() {
        List<Parkovisko> vysledok = new ArrayList<Parkovisko>();
        String sql = "SELECT id,meno,kapacita,obsadene FROM parkovisko";


        Connection con;
        try {
            con = sql2o.open();
            vysledok = con.createQuery(sql).executeAndFetch(Parkovisko.class);
            con.close();
        } catch (Exception e) {
        e.printStackTrace();
        }
        return vysledok;
    }

    public  HashMap<Long, Double> getObsadenost() {
        HashMap<Long, Double> map = new HashMap<Long, Double>();
        List<Parkovisko> list = getParkovisko();

        for (Parkovisko parkovisko : list) {
            //System.out.println(parkovisko);
            Long id = parkovisko.getID();
            Double obsadenost = 100.0 * parkovisko.getObsadene() / parkovisko.getKapacita();
            //System.out.println(obsadenost);
            map.put(id, obsadenost);
        }

        return map;
    }

    public long[] polnoci(){
        long[] vysledok = new long[2];
        Long time = new Date().getTime();
        Date date = new Date(time - time % (24 * 60 * 60 * 1000));
        vysledok[0] = date.getTime();
        date = new Date(date.getTime() + 24 * 60 * 60 * 1000);
        vysledok[1] = date.getTime();
        return vysledok;
    }
}
