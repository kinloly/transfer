
package com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_order_list;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_order_list package. 
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

    private final static QName _OutputParametersXVERRORMESSAGE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "XV_ERROR_MESSAGE");
    private final static QName _OutputParametersPNPAGECOUNT_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "PN_PAGE_COUNT");
    private final static QName _OutputParametersXVERRORCODE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "XV_ERROR_CODE");
    private final static QName _OutputParametersXRHEADDATA_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "XR_HEAD_DATA");
    private final static QName _InputParametersPVBILLNO_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "PV_BILL_NO");
    private final static QName _InputParametersPNSERIALNO_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "PN_SERIAL_NO");
    private final static QName _InputParametersPNPAGENUM_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "PN_PAGE_NUM");
    private final static QName _InputParametersPNPAGEROWS_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "PN_PAGE_ROWS");
    private final static QName _InputParametersPVLOADSTATUS_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "PV_LOAD_STATUS");
    private final static QName _APPSCUXCARMANAGESX1699609X1X4SHIPPLANNAME_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "SHIP_PLAN_NAME");
    private final static QName _APPSCUXCARMANAGESX1699609X1X4UNLOADPLACE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "UNLOAD_PLACE");
    private final static QName _APPSCUXCARMANAGESX1699609X1X4BILLTYPE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "BILL_TYPE");
    private final static QName _APPSCUXCARMANAGESX1699609X1X4ERRORMSG_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "ERROR_MSG");
    private final static QName _APPSCUXCARMANAGESX1699609X1X4BILLNO_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "BILL_NO");
    private final static QName _APPSCUXCARMANAGESX1699609X1X4PLANCARSQTY_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "PLAN_CARS_QTY");
    private final static QName _APPSCUXCARMANAGESX1699609X1X4ORGID_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "ORG_ID");
    private final static QName _APPSCUXCARMANAGESX1699609X1X4BILLLINEID_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "BILL_LINE_ID");
    private final static QName _APPSCUXCARMANAGESX1699609X1X4ORGNAME_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "ORG_NAME");
    private final static QName _APPSCUXCARMANAGESX1699609X1X4LOADSTATUS_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "LOAD_STATUS");
    private final static QName _APPSCUXCARMANAGESX1699609X1X4SHIPPLANID_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "SHIP_PLAN_ID");
    private final static QName _APPSCUXCARMANAGESX1699609X1X4ITEMCODE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "ITEM_CODE");
    private final static QName _APPSCUXCARMANAGESX1699609X1X4LOADPLACE_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "LOAD_PLACE");
    private final static QName _APPSCUXCARMANAGESX1699609X1X4DELFLAG_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "DEL_FLAG");
    private final static QName _APPSCUXCARMANAGESX1699609X1X4ITEMNAME_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "ITEM_NAME");
    private final static QName _APPSCUXCARMANAGESX1699609X1X4HEADERID_QNAME = new QName("http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", "HEADER_ID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_order_list
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
     * Create an instance of {@link APPSCUXCARMANAGESX1699609X1X3 }
     * 
     */
    public APPSCUXCARMANAGESX1699609X1X3 createAPPSCUXCARMANAGESX1699609X1X3() {
        return new APPSCUXCARMANAGESX1699609X1X3();
    }

    /**
     * Create an instance of {@link InputParameters }
     * 
     */
    public InputParameters createInputParameters() {
        return new InputParameters();
    }

    /**
     * Create an instance of {@link APPSCUXCARMANAGESX1699609X1X4 }
     * 
     */
    public APPSCUXCARMANAGESX1699609X1X4 createAPPSCUXCARMANAGESX1699609X1X4() {
        return new APPSCUXCARMANAGESX1699609X1X4();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "XV_ERROR_MESSAGE", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXVERRORMESSAGE(String value) {
        return new JAXBElement<String>(_OutputParametersXVERRORMESSAGE_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "PN_PAGE_COUNT", scope = OutputParameters.class)
    public JAXBElement<Integer> createOutputParametersPNPAGECOUNT(Integer value) {
        return new JAXBElement<Integer>(_OutputParametersPNPAGECOUNT_QNAME, Integer.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "XV_ERROR_CODE", scope = OutputParameters.class)
    public JAXBElement<String> createOutputParametersXVERRORCODE(String value) {
        return new JAXBElement<String>(_OutputParametersXVERRORCODE_QNAME, String.class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPSCUXCARMANAGESX1699609X1X3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "XR_HEAD_DATA", scope = OutputParameters.class)
    public JAXBElement<APPSCUXCARMANAGESX1699609X1X3> createOutputParametersXRHEADDATA(APPSCUXCARMANAGESX1699609X1X3 value) {
        return new JAXBElement<APPSCUXCARMANAGESX1699609X1X3>(_OutputParametersXRHEADDATA_QNAME, APPSCUXCARMANAGESX1699609X1X3 .class, OutputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "PV_BILL_NO", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersPVBILLNO(String value) {
        return new JAXBElement<String>(_InputParametersPVBILLNO_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "PN_SERIAL_NO", scope = InputParameters.class)
    public JAXBElement<BigDecimal> createInputParametersPNSERIALNO(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_InputParametersPNSERIALNO_QNAME, BigDecimal.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "PN_PAGE_NUM", scope = InputParameters.class)
    public JAXBElement<Integer> createInputParametersPNPAGENUM(Integer value) {
        return new JAXBElement<Integer>(_InputParametersPNPAGENUM_QNAME, Integer.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "PN_PAGE_ROWS", scope = InputParameters.class)
    public JAXBElement<Integer> createInputParametersPNPAGEROWS(Integer value) {
        return new JAXBElement<Integer>(_InputParametersPNPAGEROWS_QNAME, Integer.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "PV_LOAD_STATUS", scope = InputParameters.class)
    public JAXBElement<String> createInputParametersPVLOADSTATUS(String value) {
        return new JAXBElement<String>(_InputParametersPVLOADSTATUS_QNAME, String.class, InputParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "SHIP_PLAN_NAME", scope = APPSCUXCARMANAGESX1699609X1X4 .class)
    public JAXBElement<String> createAPPSCUXCARMANAGESX1699609X1X4SHIPPLANNAME(String value) {
        return new JAXBElement<String>(_APPSCUXCARMANAGESX1699609X1X4SHIPPLANNAME_QNAME, String.class, APPSCUXCARMANAGESX1699609X1X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "UNLOAD_PLACE", scope = APPSCUXCARMANAGESX1699609X1X4 .class)
    public JAXBElement<String> createAPPSCUXCARMANAGESX1699609X1X4UNLOADPLACE(String value) {
        return new JAXBElement<String>(_APPSCUXCARMANAGESX1699609X1X4UNLOADPLACE_QNAME, String.class, APPSCUXCARMANAGESX1699609X1X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "BILL_TYPE", scope = APPSCUXCARMANAGESX1699609X1X4 .class)
    public JAXBElement<String> createAPPSCUXCARMANAGESX1699609X1X4BILLTYPE(String value) {
        return new JAXBElement<String>(_APPSCUXCARMANAGESX1699609X1X4BILLTYPE_QNAME, String.class, APPSCUXCARMANAGESX1699609X1X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "ERROR_MSG", scope = APPSCUXCARMANAGESX1699609X1X4 .class)
    public JAXBElement<String> createAPPSCUXCARMANAGESX1699609X1X4ERRORMSG(String value) {
        return new JAXBElement<String>(_APPSCUXCARMANAGESX1699609X1X4ERRORMSG_QNAME, String.class, APPSCUXCARMANAGESX1699609X1X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "BILL_NO", scope = APPSCUXCARMANAGESX1699609X1X4 .class)
    public JAXBElement<String> createAPPSCUXCARMANAGESX1699609X1X4BILLNO(String value) {
        return new JAXBElement<String>(_APPSCUXCARMANAGESX1699609X1X4BILLNO_QNAME, String.class, APPSCUXCARMANAGESX1699609X1X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "PLAN_CARS_QTY", scope = APPSCUXCARMANAGESX1699609X1X4 .class)
    public JAXBElement<BigDecimal> createAPPSCUXCARMANAGESX1699609X1X4PLANCARSQTY(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCUXCARMANAGESX1699609X1X4PLANCARSQTY_QNAME, BigDecimal.class, APPSCUXCARMANAGESX1699609X1X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "ORG_ID", scope = APPSCUXCARMANAGESX1699609X1X4 .class)
    public JAXBElement<BigDecimal> createAPPSCUXCARMANAGESX1699609X1X4ORGID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCUXCARMANAGESX1699609X1X4ORGID_QNAME, BigDecimal.class, APPSCUXCARMANAGESX1699609X1X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "BILL_LINE_ID", scope = APPSCUXCARMANAGESX1699609X1X4 .class)
    public JAXBElement<BigDecimal> createAPPSCUXCARMANAGESX1699609X1X4BILLLINEID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCUXCARMANAGESX1699609X1X4BILLLINEID_QNAME, BigDecimal.class, APPSCUXCARMANAGESX1699609X1X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "ORG_NAME", scope = APPSCUXCARMANAGESX1699609X1X4 .class)
    public JAXBElement<String> createAPPSCUXCARMANAGESX1699609X1X4ORGNAME(String value) {
        return new JAXBElement<String>(_APPSCUXCARMANAGESX1699609X1X4ORGNAME_QNAME, String.class, APPSCUXCARMANAGESX1699609X1X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "LOAD_STATUS", scope = APPSCUXCARMANAGESX1699609X1X4 .class)
    public JAXBElement<String> createAPPSCUXCARMANAGESX1699609X1X4LOADSTATUS(String value) {
        return new JAXBElement<String>(_APPSCUXCARMANAGESX1699609X1X4LOADSTATUS_QNAME, String.class, APPSCUXCARMANAGESX1699609X1X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "SHIP_PLAN_ID", scope = APPSCUXCARMANAGESX1699609X1X4 .class)
    public JAXBElement<BigDecimal> createAPPSCUXCARMANAGESX1699609X1X4SHIPPLANID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCUXCARMANAGESX1699609X1X4SHIPPLANID_QNAME, BigDecimal.class, APPSCUXCARMANAGESX1699609X1X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "ITEM_CODE", scope = APPSCUXCARMANAGESX1699609X1X4 .class)
    public JAXBElement<String> createAPPSCUXCARMANAGESX1699609X1X4ITEMCODE(String value) {
        return new JAXBElement<String>(_APPSCUXCARMANAGESX1699609X1X4ITEMCODE_QNAME, String.class, APPSCUXCARMANAGESX1699609X1X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "LOAD_PLACE", scope = APPSCUXCARMANAGESX1699609X1X4 .class)
    public JAXBElement<String> createAPPSCUXCARMANAGESX1699609X1X4LOADPLACE(String value) {
        return new JAXBElement<String>(_APPSCUXCARMANAGESX1699609X1X4LOADPLACE_QNAME, String.class, APPSCUXCARMANAGESX1699609X1X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "DEL_FLAG", scope = APPSCUXCARMANAGESX1699609X1X4 .class)
    public JAXBElement<String> createAPPSCUXCARMANAGESX1699609X1X4DELFLAG(String value) {
        return new JAXBElement<String>(_APPSCUXCARMANAGESX1699609X1X4DELFLAG_QNAME, String.class, APPSCUXCARMANAGESX1699609X1X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "ITEM_NAME", scope = APPSCUXCARMANAGESX1699609X1X4 .class)
    public JAXBElement<String> createAPPSCUXCARMANAGESX1699609X1X4ITEMNAME(String value) {
        return new JAXBElement<String>(_APPSCUXCARMANAGESX1699609X1X4ITEMNAME_QNAME, String.class, APPSCUXCARMANAGESX1699609X1X4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", name = "HEADER_ID", scope = APPSCUXCARMANAGESX1699609X1X4 .class)
    public JAXBElement<BigDecimal> createAPPSCUXCARMANAGESX1699609X1X4HEADERID(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APPSCUXCARMANAGESX1699609X1X4HEADERID_QNAME, BigDecimal.class, APPSCUXCARMANAGESX1699609X1X4 .class, value);
    }

}
