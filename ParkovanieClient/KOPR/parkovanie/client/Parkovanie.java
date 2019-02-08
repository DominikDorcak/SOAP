
package KOPR.parkovanie.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Parkovanie", targetNamespace = "http://parkovanie/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Parkovanie {


    /**
     * 
     * @return
     *     returns java.util.List<KOPR.parkovanie.client.MapElement>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "zistiPlnost", targetNamespace = "http://parkovanie/", className = "KOPR.parkovanie.client.ZistiPlnost")
    @ResponseWrapper(localName = "zistiPlnostResponse", targetNamespace = "http://parkovanie/", className = "KOPR.parkovanie.client.ZistiPlnostResponse")
    @Action(input = "http://parkovanie/Parkovanie/zistiPlnostRequest", output = "http://parkovanie/Parkovanie/zistiPlnostResponse")
    public List<MapElement> zistiPlnost();

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "odparkuj", targetNamespace = "http://parkovanie/", className = "KOPR.parkovanie.client.Odparkuj")
    @ResponseWrapper(localName = "odparkujResponse", targetNamespace = "http://parkovanie/", className = "KOPR.parkovanie.client.OdparkujResponse")
    @Action(input = "http://parkovanie/Parkovanie/odparkujRequest", output = "http://parkovanie/Parkovanie/odparkujResponse")
    public boolean odparkuj(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "zaparkuj", targetNamespace = "http://parkovanie/", className = "KOPR.parkovanie.client.Zaparkuj")
    @ResponseWrapper(localName = "zaparkujResponse", targetNamespace = "http://parkovanie/", className = "KOPR.parkovanie.client.ZaparkujResponse")
    @Action(input = "http://parkovanie/Parkovanie/zaparkujRequest", output = "http://parkovanie/Parkovanie/zaparkujResponse")
    public Long zaparkuj(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "pocetNavstev", targetNamespace = "http://parkovanie/", className = "KOPR.parkovanie.client.PocetNavstev")
    @ResponseWrapper(localName = "pocetNavstevResponse", targetNamespace = "http://parkovanie/", className = "KOPR.parkovanie.client.PocetNavstevResponse")
    @Action(input = "http://parkovanie/Parkovanie/pocetNavstevRequest", output = "http://parkovanie/Parkovanie/pocetNavstevResponse")
    public int pocetNavstev(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

}