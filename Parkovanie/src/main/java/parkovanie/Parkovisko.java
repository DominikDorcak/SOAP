package parkovanie;

public class Parkovisko {

    private long ID;
    private String meno;
    private int kapacita;
    private int obsadene;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public int getKapacita() {
        return kapacita;
    }

    public void setKapacita(int kapacita) {
        this.kapacita = kapacita;
    }

    public int getObsadene() {
        return obsadene;
    }

    public void setObsadene(int obsadene) {
        this.obsadene = obsadene;
    }
}
