
package KOPR.parkovanie.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the KOPR.parkovanie.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PocetNavstevResponse_QNAME = new QName("http://parkovanie/", "pocetNavstevResponse");
    private final static QName _Zaparkuj_QNAME = new QName("http://parkovanie/", "zaparkuj");
    private final static QName _PocetNavstev_QNAME = new QName("http://parkovanie/", "pocetNavstev");
    private final static QName _OdparkujResponse_QNAME = new QName("http://parkovanie/", "odparkujResponse");
    private final static QName _Odparkuj_QNAME = new QName("http://parkovanie/", "odparkuj");
    private final static QName _ZaparkujResponse_QNAME = new QName("http://parkovanie/", "zaparkujResponse");
    private final static QName _ZistiPlnost_QNAME = new QName("http://parkovanie/", "zistiPlnost");
    private final static QName _ZistiPlnostResponse_QNAME = new QName("http://parkovanie/", "zistiPlnostResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: KOPR.parkovanie.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PocetNavstevResponse }
     * 
     */
    public PocetNavstevResponse createPocetNavstevResponse() {
        return new PocetNavstevResponse();
    }

    /**
     * Create an instance of {@link Zaparkuj }
     * 
     */
    public Zaparkuj createZaparkuj() {
        return new Zaparkuj();
    }

    /**
     * Create an instance of {@link PocetNavstev }
     * 
     */
    public PocetNavstev createPocetNavstev() {
        return new PocetNavstev();
    }

    /**
     * Create an instance of {@link Odparkuj }
     * 
     */
    public Odparkuj createOdparkuj() {
        return new Odparkuj();
    }

    /**
     * Create an instance of {@link ZaparkujResponse }
     * 
     */
    public ZaparkujResponse createZaparkujResponse() {
        return new ZaparkujResponse();
    }

    /**
     * Create an instance of {@link OdparkujResponse }
     * 
     */
    public OdparkujResponse createOdparkujResponse() {
        return new OdparkujResponse();
    }

    /**
     * Create an instance of {@link ZistiPlnostResponse }
     * 
     */
    public ZistiPlnostResponse createZistiPlnostResponse() {
        return new ZistiPlnostResponse();
    }

    /**
     * Create an instance of {@link ZistiPlnost }
     * 
     */
    public ZistiPlnost createZistiPlnost() {
        return new ZistiPlnost();
    }

    /**
     * Create an instance of {@link MapElement }
     * 
     */
    public MapElement createMapElement() {
        return new MapElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PocetNavstevResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkovanie/", name = "pocetNavstevResponse")
    public JAXBElement<PocetNavstevResponse> createPocetNavstevResponse(PocetNavstevResponse value) {
        return new JAXBElement<PocetNavstevResponse>(_PocetNavstevResponse_QNAME, PocetNavstevResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Zaparkuj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkovanie/", name = "zaparkuj")
    public JAXBElement<Zaparkuj> createZaparkuj(Zaparkuj value) {
        return new JAXBElement<Zaparkuj>(_Zaparkuj_QNAME, Zaparkuj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PocetNavstev }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkovanie/", name = "pocetNavstev")
    public JAXBElement<PocetNavstev> createPocetNavstev(PocetNavstev value) {
        return new JAXBElement<PocetNavstev>(_PocetNavstev_QNAME, PocetNavstev.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OdparkujResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkovanie/", name = "odparkujResponse")
    public JAXBElement<OdparkujResponse> createOdparkujResponse(OdparkujResponse value) {
        return new JAXBElement<OdparkujResponse>(_OdparkujResponse_QNAME, OdparkujResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Odparkuj }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkovanie/", name = "odparkuj")
    public JAXBElement<Odparkuj> createOdparkuj(Odparkuj value) {
        return new JAXBElement<Odparkuj>(_Odparkuj_QNAME, Odparkuj.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZaparkujResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkovanie/", name = "zaparkujResponse")
    public JAXBElement<ZaparkujResponse> createZaparkujResponse(ZaparkujResponse value) {
        return new JAXBElement<ZaparkujResponse>(_ZaparkujResponse_QNAME, ZaparkujResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZistiPlnost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkovanie/", name = "zistiPlnost")
    public JAXBElement<ZistiPlnost> createZistiPlnost(ZistiPlnost value) {
        return new JAXBElement<ZistiPlnost>(_ZistiPlnost_QNAME, ZistiPlnost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZistiPlnostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://parkovanie/", name = "zistiPlnostResponse")
    public JAXBElement<ZistiPlnostResponse> createZistiPlnostResponse(ZistiPlnostResponse value) {
        return new JAXBElement<ZistiPlnostResponse>(_ZistiPlnostResponse_QNAME, ZistiPlnostResponse.class, null, value);
    }

}
