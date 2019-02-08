package parkovanie;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@WebService()
public class Parkovanie {

    private Dao Dao;

    public Parkovanie(){
        Dao = new Dao();
    }

    @WebMethod
    public Long zaparkuj(long parkoviskoID, String ecv) {
        Listok listok = Dao.insertListok(ecv,parkoviskoID);
        return listok.getID();
    }
    @WebMethod
    public boolean odparkuj(long listokID) {
        return Dao.ukonciListok(listokID);
    }
    @WebMethod
    public MapElement[] zistiPlnost(){
        HashMap<Long,Double> mapa = Dao.getObsadenost();
        MapElement[] vysledok = new MapElement[mapa.keySet().size()];
        int i = 0;
        for (Long id:mapa.keySet()) {
            vysledok[i] = new MapElement(id,mapa.get(id));
            i++;
        }
        return vysledok;
    }
    @WebMethod
    public int pocetNavstev(long parkoviskoID){
        int vysledok = Dao.getListokDnes(parkoviskoID).size();
        return vysledok;
    }


    public static void main(String[] argv) {
        Object implementor = new Parkovanie();
        String address = "http://localhost:9000/Parkovanie";
        Endpoint.publish(address, implementor);
    }

}
