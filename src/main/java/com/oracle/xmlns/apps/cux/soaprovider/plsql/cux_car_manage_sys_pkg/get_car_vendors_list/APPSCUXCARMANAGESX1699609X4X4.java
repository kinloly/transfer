
package com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_vendors_list;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>APPS.CUX_CAR_MANAGE_SX1699609X4X4 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="APPS.CUX_CAR_MANAGE_SX1699609X4X4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRANS_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TRANS_NAME" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CAR_QUOTA_QTY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="APPLY_END_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LOAD_START_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CAR_COUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RATED_LOAD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPS.CUX_CAR_MANAGE_SX1699609X4X4", propOrder = {
    "transid",
    "transname",
    "carquotaqty",
    "applyenddate",
    "loadstartdate",
    "carcount",
    "ratedload"
})
public class APPSCUXCARMANAGESX1699609X4X4 {

    @XmlElementRef(name = "TRANS_ID", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> transid;
    @XmlElementRef(name = "TRANS_NAME", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> transname;
    @XmlElementRef(name = "CAR_QUOTA_QTY", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> carquotaqty;
    @XmlElementRef(name = "APPLY_END_DATE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> applyenddate;
    @XmlElementRef(name = "LOAD_START_DATE", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> loadstartdate;
    @XmlElementRef(name = "CAR_COUNT", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> carcount;
    @XmlElementRef(name = "RATED_LOAD", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_vendors_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ratedload;

    /**
     * 获取transid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTRANSID() {
        return transid;
    }

    /**
     * 设置transid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTRANSID(JAXBElement<BigDecimal> value) {
        this.transid = value;
    }

    /**
     * 获取transname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTRANSNAME() {
        return transname;
    }

    /**
     * 设置transname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTRANSNAME(JAXBElement<BigDecimal> value) {
        this.transname = value;
    }

    /**
     * 获取carquotaqty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCARQUOTAQTY() {
        return carquotaqty;
    }

    /**
     * 设置carquotaqty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCARQUOTAQTY(JAXBElement<BigDecimal> value) {
        this.carquotaqty = value;
    }

    /**
     * 获取applyenddate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAPPLYENDDATE() {
        return applyenddate;
    }

    /**
     * 设置applyenddate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAPPLYENDDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.applyenddate = value;
    }

    /**
     * 获取loadstartdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLOADSTARTDATE() {
        return loadstartdate;
    }

    /**
     * 设置loadstartdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLOADSTARTDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.loadstartdate = value;
    }

    /**
     * 获取carcount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCARCOUNT() {
        return carcount;
    }

    /**
     * 设置carcount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCARCOUNT(JAXBElement<BigDecimal> value) {
        this.carcount = value;
    }

    /**
     * 获取ratedload属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRATEDLOAD() {
        return ratedload;
    }

    /**
     * 设置ratedload属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRATEDLOAD(JAXBElement<BigDecimal> value) {
        this.ratedload = value;
    }

}
