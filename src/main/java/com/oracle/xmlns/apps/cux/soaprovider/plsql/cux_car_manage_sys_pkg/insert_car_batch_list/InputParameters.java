
package com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.insert_car_batch_list;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="PV_SHIP_PLAN_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PD_APPLY_END_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PD_LOAD_START_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PV_LOAD_PLACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PV_UNLOAD_PLACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PN_PLAN_CARS_QTY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PV_CREATED_BY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pvshipplanname",
    "pdapplyenddate",
    "pdloadstartdate",
    "pvloadplace",
    "pvunloadplace",
    "pnplancarsqty",
    "pvcreatedby"
})
@XmlRootElement(name = "InputParameters")
public class InputParameters {

    @XmlElementRef(name = "PN_SERIAL_NO", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pnserialno;
    @XmlElementRef(name = "PV_SHIP_PLAN_NAME", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pvshipplanname;
    @XmlElementRef(name = "PD_APPLY_END_DATE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> pdapplyenddate;
    @XmlElementRef(name = "PD_LOAD_START_DATE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> pdloadstartdate;
    @XmlElementRef(name = "PV_LOAD_PLACE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pvloadplace;
    @XmlElementRef(name = "PV_UNLOAD_PLACE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pvunloadplace;
    @XmlElementRef(name = "PN_PLAN_CARS_QTY", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pnplancarsqty;
    @XmlElementRef(name = "PV_CREATED_BY", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_batch_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pvcreatedby;

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
     * 获取pvshipplanname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPVSHIPPLANNAME() {
        return pvshipplanname;
    }

    /**
     * 设置pvshipplanname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPVSHIPPLANNAME(JAXBElement<String> value) {
        this.pvshipplanname = value;
    }

    /**
     * 获取pdapplyenddate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPDAPPLYENDDATE() {
        return pdapplyenddate;
    }

    /**
     * 设置pdapplyenddate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPDAPPLYENDDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.pdapplyenddate = value;
    }

    /**
     * 获取pdloadstartdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPDLOADSTARTDATE() {
        return pdloadstartdate;
    }

    /**
     * 设置pdloadstartdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPDLOADSTARTDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.pdloadstartdate = value;
    }

    /**
     * 获取pvloadplace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPVLOADPLACE() {
        return pvloadplace;
    }

    /**
     * 设置pvloadplace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPVLOADPLACE(JAXBElement<String> value) {
        this.pvloadplace = value;
    }

    /**
     * 获取pvunloadplace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPVUNLOADPLACE() {
        return pvunloadplace;
    }

    /**
     * 设置pvunloadplace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPVUNLOADPLACE(JAXBElement<String> value) {
        this.pvunloadplace = value;
    }

    /**
     * 获取pnplancarsqty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPNPLANCARSQTY() {
        return pnplancarsqty;
    }

    /**
     * 设置pnplancarsqty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPNPLANCARSQTY(JAXBElement<BigDecimal> value) {
        this.pnplancarsqty = value;
    }

    /**
     * 获取pvcreatedby属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPVCREATEDBY() {
        return pvcreatedby;
    }

    /**
     * 设置pvcreatedby属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPVCREATEDBY(JAXBElement<String> value) {
        this.pvcreatedby = value;
    }

}
