
package com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.insert_car_batch_list;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.insert_car_batch_list package. 
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

    private final static QName _OutputParametersXVERRORMESSAGE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", "XV_ERROR_MESSAGE");
    private final static QName _OutputParametersPNSHIPPLANID_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", "PN_SHIP_PLAN_ID");
    private final static QName _OutputParametersXVERRORCODE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", "XV_ERROR_CODE");
    private final static QName _InputParametersPVLOADPLACE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", "PV_LOAD_PLACE");
    private final static QName _InputParametersPVUNLOADPLACE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", "PV_UNLOAD_PLACE");
    private final static QName _InputParametersPDLOADSTARTDATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", "PD_LOAD_START_DATE");
    private final static QName _InputParametersPNSERIALNO_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", "PN_SERIAL_NO");
    private final static QName _InputParametersPDAPPLYENDDATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", "PD_APPLY_END_DATE");
    private final static QName _InputParametersPVSHIPPLANNAME_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", "PV_SHIP_PLAN_NAME");
    private final static QName _InputParametersPNPLANCARSQTY_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", "PN_PLAN_CARS_QTY");
    private final static QName _InputParametersPVCREATEDBY_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", "PV_CREATED_BY");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.insert_car_batch_list
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
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", name = "XV_ERROR_MESSAGE", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXVERRORMESSAGE(String value) {
        return new JAXBElement<String>(_OutputParametersXVERRORMESSAGE_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", name = "PN_SHIP_PLAN_ID", scope = OutputParameters.class)
    public JAXBElement<Integer> createOutputParametersPNSHIPPLANID(Integer value) {
        return new JAXBElement<Integer>(_OutputParametersPNSHIPPLANID_QNAME, Integer.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", name = "XV_ERROR_CODE", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXVERRORCODE(String value) {
        return new JAXBElement<String>(_OutputParametersXVERRORCODE_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", name = "PV_LOAD_PLACE", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersPVLOADPLACE(String value) {
        return new JAXBElement<String>(_InputParametersPVLOADPLACE_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", name = "PV_UNLOAD_PLACE", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersPVUNLOADPLACE(String value) {
        return new JAXBElement<String>(_InputParametersPVUNLOADPLACE_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", name = "PD_LOAD_START_DATE", scope = InputParameters.class)
    public JAXBElement<XMLGregorianCalendar> createInputParametersPDLOADSTARTDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InputParametersPDLOADSTARTDATE_QNAME, XMLGregorianCalendar.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", name = "PN_SERIAL_NO", scope = InputParameters.class)
    public JAXBElement<BigDecimal> createInputParametersPNSERIALNO(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InputParametersPNSERIALNO_QNAME, BigDecimal.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", name = "PD_APPLY_END_DATE", scope = InputParameters.class)
    public JAXBElement<XMLGregorianCalendar> createInputParametersPDAPPLYENDDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InputParametersPDAPPLYENDDATE_QNAME, XMLGregorianCalendar.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", name = "PV_SHIP_PLAN_NAME", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersPVSHIPPLANNAME(String value) {
        return new JAXBElement<String>(_InputParametersPVSHIPPLANNAME_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", name = "PN_PLAN_CARS_QTY", scope = InputParameters.class)
    public JAXBElement<BigDecimal> createInputParametersPNPLANCARSQTY(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InputParametersPNPLANCARSQTY_QNAME, BigDecimal.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", name = "PV_CREATED_BY", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersPVCREATEDBY(String value) {
        return new JAXBElement<String>(_InputParametersPVCREATEDBY_QNAME, String.class, InputParameters.class, value);
    }

}
