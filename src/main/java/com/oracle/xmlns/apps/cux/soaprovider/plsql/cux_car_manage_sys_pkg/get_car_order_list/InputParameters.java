
package com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_order_list;

import java.math.BigDecimal;
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
 *         &lt;element name="PN_SERIAL_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PV_BILL_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PV_LOAD_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PN_PAGE_NUM" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PN_PAGE_ROWS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "pnserialno",
    "pvbillno",
    "pvloadstatus",
    "pnpagenum",
    "pnpagerows"
})
@XmlRootElement(name = "InputParameters")
public class InputParameters {

    @XmlElementRef(name = "PN_SERIAL_NO", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pnserialno;
    @XmlElementRef(name = "PV_BILL_NO", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pvbillno;
    @XmlElementRef(name = "PV_LOAD_STATUS", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pvloadstatus;
    @XmlElementRef(name = "PN_PAGE_NUM", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pnpagenum;
    @XmlElementRef(name = "PN_PAGE_ROWS", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_order_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pnpagerows;

    /**
     * 获取pnserialno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPNSERIALNO() {
        return pnserialno;
    }

    /**
     * 设置pnserialno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPNSERIALNO(JAXBElement<BigDecimal> value) {
        this.pnserialno = value;
    }

    /**
     * 获取pvbillno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPVBILLNO() {
        return pvbillno;
    }

    /**
     * 设置pvbillno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPVBILLNO(JAXBElement<String> value) {
        this.pvbillno = value;
    }

    /**
     * 获取pvloadstatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPVLOADSTATUS() {
        return pvloadstatus;
    }

    /**
     * 设置pvloadstatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPVLOADSTATUS(JAXBElement<String> value) {
        this.pvloadstatus = value;
    }

    /**
     * 获取pnpagenum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPNPAGENUM() {
        return pnpagenum;
    }

    /**
     * 设置pnpagenum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPNPAGENUM(JAXBElement<Integer> value) {
        this.pnpagenum = value;
    }

    /**
     * 获取pnpagerows属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPNPAGEROWS() {
        return pnpagerows;
    }

    /**
     * 设置pnpagerows属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPNPAGEROWS(JAXBElement<Integer> value) {
        this.pnpagerows = value;
    }

}
