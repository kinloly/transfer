
package com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_order_list;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XV_ERROR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XV_ERROR_MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XR_HEAD_DATA" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/}APPS.CUX_CAR_MANAGE_SX1699609X1X3" minOccurs="0"/>
 *         &lt;element name="PN_PAGE_COUNT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xverrorcode",
    "xverrormessage",
    "xrheaddata",
    "pnpagecount"
})
@XmlRootElement(name = "OutputParameters")
public class OutputParameters {

    @XmlElementRef(name = "XV_ERROR_CODE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xverrorcode;
    @XmlElementRef(name = "XV_ERROR_MESSAGE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xverrormessage;
    @XmlElementRef(name = "XR_HEAD_DATA", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<APPSCUXCARMANAGESX1699609X1X3> xrheaddata;
    @XmlElementRef(name = "PN_PAGE_COUNT", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pnpagecount;

    /**
     * 获取xverrorcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXVERRORCODE() {
        return xverrorcode;
    }

    /**
     * 设置xverrorcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXVERRORCODE(JAXBElement<String> value) {
        this.xverrorcode = value;
    }

    /**
     * 获取xverrormessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXVERRORMESSAGE() {
        return xverrormessage;
    }

    /**
     * 设置xverrormessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXVERRORMESSAGE(JAXBElement<String> value) {
        this.xverrormessage = value;
    }

    /**
     * 获取xrheaddata属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link APPSCUXCARMANAGESX1699609X1X3 }{@code >}
     *     
     */
    public JAXBElement<APPSCUXCARMANAGESX1699609X1X3> getXRHEADDATA() {
        return xrheaddata;
    }

    /**
     * 设置xrheaddata属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link APPSCUXCARMANAGESX1699609X1X3 }{@code >}
     *     
     */
    public void setXRHEADDATA(JAXBElement<APPSCUXCARMANAGESX1699609X1X3> value) {
        this.xrheaddata = value;
    }

    /**
     * 获取pnpagecount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPNPAGECOUNT() {
        return pnpagecount;
    }

    /**
     * 设置pnpagecount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPNPAGECOUNT(JAXBElement<Integer> value) {
        this.pnpagecount = value;
    }

}
