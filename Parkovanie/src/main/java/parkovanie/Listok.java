package parkovanie;


public class Listok {

    private long ID;
    private String ecv;
    private long Parkovisko_id;
    private long prichod;
    private long odchod;

    public Listok(String ecv,long Parkovisko_id) {
        this.ecv = ecv;
        this.Parkovisko_id = Parkovisko_id;
        this.prichod = System.currentTimeMillis();
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getEcv() {
        return ecv;
    }

    public void setEcv(String ecv) {
        this.ecv = ecv;
    }

    public long getPrichod() {
        return prichod;
    }

    public void setPrichod(long prichod) {
        this.prichod = prichod;
    }

    public long getOdchod() {
        return odchod;
    }

    public void setOdchod(long odchod) {
        this.odchod = odchod;
    }

    public long getParkovisko_id() {
        return Parkovisko_id;
    }

    public void setParkovisko_id(long parkovisko_id) {
        this.Parkovisko_id = parkovisko_id;
    }
}
