
package com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_vendors_list;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_vendors_list package. 
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

    private final static QName _OutputParametersXRVENDORSDATA_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", "XR_VENDORS_DATA");
    private final static QName _OutputParametersXVERRORCODE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", "XV_ERROR_CODE");
    private final static QName _OutputParametersXVERRORMESSAGE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", "XV_ERROR_MESSAGE");
    private final static QName _APPSCUXCARMANAGESX1699609X4X4LOADSTARTDATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", "LOAD_START_DATE");
    private final static QName _APPSCUXCARMANAGESX1699609X4X4TRANSID_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", "TRANS_ID");
    private final static QName _APPSCUXCARMANAGESX1699609X4X4RATEDLOAD_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", "RATED_LOAD");
    private final static QName _APPSCUXCARMANAGESX1699609X4X4TRANSNAME_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", "TRANS_NAME");
    private final static QName _APPSCUXCARMANAGESX1699609X4X4APPLYENDDATE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", "APPLY_END_DATE");
    private final static QName _APPSCUXCARMANAGESX1699609X4X4CARQUOTAQTY_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", "CAR_QUOTA_QTY");
    private final static QName _APPSCUXCARMANAGESX1699609X4X4CARCOUNT_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", "CAR_COUNT");
    private final static QName _InputParametersPNSHIPPLANID_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", "PN_SHIP_PLAN_ID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_vendors_list
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
     * Create an instance of {@link APPSCUXCARMANAGESX1699609X4X3 }
     * 
     */
    public APPSCUXCARMANAGESX1699609X4X3 createAPPSCUXCARMANAGESX1699609X4X3() {
        return new APPSCUXCARMANAGESX1699609X4X3();
    }

    /**
     * Create an instance of {@link InputParameters }
     * 
     */
    public InputParameters createInputParameters() {
        return new InputParameters();
    }

    /**
     * Create an instance of {@link APPSCUXCARMANAGESX1699609X4X4 }
     * 
     */
    public APPSCUXCARMANAGESX1699609X4X4 createAPPSCUXCARMANAGESX1699609X4X4() {
        return new APPSCUXCARMANAGESX1699609X4X4();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPSCUXCARMANAGESX1699609X4X3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", name = "XR_VENDORS_DATA", scope = OutputParameters.class)
    public JAXBElement<APPSCUXCARMANAGESX1699609X4X3> createOutputParametersXRVENDORSDATA(APPSCUXCARMANAGESX1699609X4X3 value) {
        return new JAXBElement<APPSCUXCARMANAGESX1699609X4X3>(_OutputParametersXRVENDORSDATA_QNAME, APPSCUXCARMANAGESX1699609X4X3 .class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", name = "XV_ERROR_CODE", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXVERRORCODE(String value) {
        return new JAXBElement<String>(_OutputParametersXVERRORCODE_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", name = "XV_ERROR_MESSAGE", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXVERRORMESSAGE(String value) {
        return new JAXBElement<String>(_OutputParametersXVERRORMESSAGE_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", name = "LOAD_START_DATE", scope = APPSCUXCARMANAGESX1699609X4X4 .class)
    public JAXBElement<XMLGregorianCalendar> createAPPSCUXCARMANAGESX1699609X4X4LOADSTARTDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_APPSCUXCARMANAGESX1699609X4X4LOADSTARTDATE_QNAME, XMLGregorianCalendar.class, APPSCUXCARMANAGESX1699609X4X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", name = "TRANS_ID", scope = APPSCUXCARMANAGESX1699609X4X4 .class)
    public JAXBElement<BigDecimal> createAPPSCUXCARMANAGESX1699609X4X4TRANSID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCUXCARMANAGESX1699609X4X4TRANSID_QNAME, BigDecimal.class, APPSCUXCARMANAGESX1699609X4X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", name = "RATED_LOAD", scope = APPSCUXCARMANAGESX1699609X4X4 .class)
    public JAXBElement<BigDecimal> createAPPSCUXCARMANAGESX1699609X4X4RATEDLOAD(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCUXCARMANAGESX1699609X4X4RATEDLOAD_QNAME, BigDecimal.class, APPSCUXCARMANAGESX1699609X4X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", name = "TRANS_NAME", scope = APPSCUXCARMANAGESX1699609X4X4 .class)
    public JAXBElement<BigDecimal> createAPPSCUXCARMANAGESX1699609X4X4TRANSNAME(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCUXCARMANAGESX1699609X4X4TRANSNAME_QNAME, BigDecimal.class, APPSCUXCARMANAGESX1699609X4X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", name = "APPLY_END_DATE", scope = APPSCUXCARMANAGESX1699609X4X4 .class)
    public JAXBElement<XMLGregorianCalendar> createAPPSCUXCARMANAGESX1699609X4X4APPLYENDDATE(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_APPSCUXCARMANAGESX1699609X4X4APPLYENDDATE_QNAME, XMLGregorianCalendar.class, APPSCUXCARMANAGESX1699609X4X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", name = "CAR_QUOTA_QTY", scope = APPSCUXCARMANAGESX1699609X4X4 .class)
    public JAXBElement<BigDecimal> createAPPSCUXCARMANAGESX1699609X4X4CARQUOTAQTY(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCUXCARMANAGESX1699609X4X4CARQUOTAQTY_QNAME, BigDecimal.class, APPSCUXCARMANAGESX1699609X4X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", name = "CAR_COUNT", scope = APPSCUXCARMANAGESX1699609X4X4 .class)
    public JAXBElement<BigDecimal> createAPPSCUXCARMANAGESX1699609X4X4CARCOUNT(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCUXCARMANAGESX1699609X4X4CARCOUNT_QNAME, BigDecimal.class, APPSCUXCARMANAGESX1699609X4X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", name = "PN_SHIP_PLAN_ID", scope = InputParameters.class)
    public JAXBElement<BigDecimal> createInputParametersPNSHIPPLANID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InputParametersPNSHIPPLANID_QNAME, BigDecimal.class, InputParameters.class, value);
    }

}
