
package com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.del_car_vendors_list;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.del_car_vendors_list package. 
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

    private final static QName _OutputParametersXVERRORMESSAGE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/del_car_vendors_list/", "XV_ERROR_MESSAGE");
    private final static QName _OutputParametersXVERRORCODE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/del_car_vendors_list/", "XV_ERROR_CODE");
    private final static QName _InputParametersPNCARRIERID_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/del_car_vendors_list/", "PN_CARRIER_ID");
    private final static QName _InputParametersPVDELETEBY_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/del_car_vendors_list/", "PV_DELETE_BY");
    private final static QName _InputParametersPNSHIPPLANID_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/del_car_vendors_list/", "PN_SHIP_PLAN_ID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.del_car_vendors_list
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OutputParameters }
     * 
     */
    public OutputParameters createOutputParameters() {
        return new OutputParameters();
    }

    /**
     * Create an instance of {@link InputParameters }
     * 
     */
    public InputParameters createInputParameters() {
        return new InputParameters();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/del_car_vendors_list/", name = "XV_ERROR_MESSAGE", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXVERRORMESSAGE(String value) {
        return new JAXBElement<String>(_OutputParametersXVERRORMESSAGE_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/del_car_vendors_list/", name = "XV_ERROR_CODE", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXVERRORCODE(String value) {
        return new JAXBElement<String>(_OutputParametersXVERRORCODE_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/del_car_vendors_list/", name = "PN_CARRIER_ID", scope = InputParameters.class)
    public JAXBElement<BigDecimal> createInputParametersPNCARRIERID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InputParametersPNCARRIERID_QNAME, BigDecimal.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/del_car_vendors_list/", name = "PV_DELETE_BY", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersPVDELETEBY(String value) {
        return new JAXBElement<String>(_InputParametersPVDELETEBY_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/del_car_vendors_list/", name = "PN_SHIP_PLAN_ID", scope = InputParameters.class)
    public JAXBElement<BigDecimal> createInputParametersPNSHIPPLANID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InputParametersPNSHIPPLANID_QNAME, BigDecimal.class, InputParameters.class, value);
    }

}
