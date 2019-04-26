
package com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.insert_car_vendors_list;

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
 *         &lt;element name="PN_SHIP_PLAN_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PN_CAR_QUOTA_QTY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PV_TRANS_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pnshipplanid",
    "pncarquotaqty",
    "pvtransname",
    "pvcreatedby"
})
@XmlRootElement(name = "InputParameters")
public class InputParameters {

    @XmlElementRef(name = "PN_SHIP_PLAN_ID", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_vendors_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pnshipplanid;
    @XmlElementRef(name = "PN_CAR_QUOTA_QTY", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_vendors_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pncarquotaqty;
    @XmlElementRef(name = "PV_TRANS_NAME", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_vendors_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pvtransname;
    @XmlElementRef(name = "PV_CREATED_BY", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/insert_car_vendors_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pvcreatedby;

    /**
     * 获取pnshipplanid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPNSHIPPLANID() {
        return pnshipplanid;
    }

    /**
     * 设置pnshipplanid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPNSHIPPLANID(JAXBElement<BigDecimal> value) {
        this.pnshipplanid = value;
    }

    /**
     * 获取pncarquotaqty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPNCARQUOTAQTY() {
        return pncarquotaqty;
    }

    /**
     * 设置pncarquotaqty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPNCARQUOTAQTY(JAXBElement<BigDecimal> value) {
        this.pncarquotaqty = value;
    }

    /**
     * 获取pvtransname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPVTRANSNAME() {
        return pvtransname;
    }

    /**
     * 设置pvtransname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPVTRANSNAME(JAXBElement<String> value) {
        this.pvtransname = value;
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
