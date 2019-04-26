
package com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_batch_list;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_batch_list package. 
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

    private final static QName _OutputParametersXVERRORCODE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", "XV_ERROR_CODE");
    private final static QName _OutputParametersXVERRORMESSAGE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", "XV_ERROR_MESSAGE");
    private final static QName _OutputParametersXRLINEDATA_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", "XR_LINE_DATA");
    private final static QName _InputParametersPNSERIALNO_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", "PN_SERIAL_NO");
    private final static QName _APPSCUXCARMANAGESX1699609X2X4SHIPPLANID_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", "SHIP_PLAN_ID");
    private final static QName _APPSCUXCARMANAGESX1699609X2X4SHIPPLANNAME_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", "SHIP_PLAN_NAME");
    private final static QName _APPSCUXCARMANAGESX1699609X2X4PLANCARSQTY_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", "PLAN_CARS_QTY");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_batch_list
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
     * Create an instance of {@link APPSCUXCARMANAGESX1699609X2X3 }
     * 
     */
    public APPSCUXCARMANAGESX1699609X2X3 createAPPSCUXCARMANAGESX1699609X2X3() {
        return new APPSCUXCARMANAGESX1699609X2X3();
    }

    /**
     * Create an instance of {@link InputParameters }
     * 
     */
    public InputParameters createInputParameters() {
        return new InputParameters();
    }

    /**
     * Create an instance of {@link APPSCUXCARMANAGESX1699609X2X4 }
     * 
     */
    public APPSCUXCARMANAGESX1699609X2X4 createAPPSCUXCARMANAGESX1699609X2X4() {
        return new APPSCUXCARMANAGESX1699609X2X4();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", name = "XV_ERROR_CODE", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXVERRORCODE(String value) {
        return new JAXBElement<String>(_OutputParametersXVERRORCODE_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", name = "XV_ERROR_MESSAGE", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXVERRORMESSAGE(String value) {
        return new JAXBElement<String>(_OutputParametersXVERRORMESSAGE_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPSCUXCARMANAGESX1699609X2X3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", name = "XR_LINE_DATA", scope = OutputParameters.class)
    public JAXBElement<APPSCUXCARMANAGESX1699609X2X3> createOutputParametersXRLINEDATA(APPSCUXCARMANAGESX1699609X2X3 value) {
        return new JAXBElement<APPSCUXCARMANAGESX1699609X2X3>(_OutputParametersXRLINEDATA_QNAME, APPSCUXCARMANAGESX1699609X2X3 .class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", name = "PN_SERIAL_NO", scope = InputParameters.class)
    public JAXBElement<BigDecimal> createInputParametersPNSERIALNO(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InputParametersPNSERIALNO_QNAME, BigDecimal.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", name = "SHIP_PLAN_ID", scope = APPSCUXCARMANAGESX1699609X2X4 .class)
    public JAXBElement<BigDecimal> createAPPSCUXCARMANAGESX1699609X2X4SHIPPLANID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCUXCARMANAGESX1699609X2X4SHIPPLANID_QNAME, BigDecimal.class, APPSCUXCARMANAGESX1699609X2X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", name = "SHIP_PLAN_NAME", scope = APPSCUXCARMANAGESX1699609X2X4 .class)
    public JAXBElement<String> createAPPSCUXCARMANAGESX1699609X2X4SHIPPLANNAME(String value) {
        return new JAXBElement<String>(_APPSCUXCARMANAGESX1699609X2X4SHIPPLANNAME_QNAME, String.class, APPSCUXCARMANAGESX1699609X2X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", name = "PLAN_CARS_QTY", scope = APPSCUXCARMANAGESX1699609X2X4 .class)
    public JAXBElement<BigDecimal> createAPPSCUXCARMANAGESX1699609X2X4PLANCARSQTY(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCUXCARMANAGESX1699609X2X4PLANCARSQTY_QNAME, BigDecimal.class, APPSCUXCARMANAGESX1699609X2X4 .class, value);
    }

}
