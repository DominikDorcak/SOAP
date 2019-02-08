package parkovanie;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class MapElement {

    private long key;
    private double value;


    public MapElement(long key, double value) {
        this.key = key;
        this.value = value;
    }
}