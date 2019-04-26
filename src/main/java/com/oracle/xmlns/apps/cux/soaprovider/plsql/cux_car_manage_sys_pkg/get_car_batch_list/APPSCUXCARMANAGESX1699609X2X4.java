
package com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_batch_list;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>APPS.CUX_CAR_MANAGE_SX1699609X2X4 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="APPS.CUX_CAR_MANAGE_SX1699609X2X4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SHIP_PLAN_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SHIP_PLAN_NAME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PLAN_CARS_QTY" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPS.CUX_CAR_MANAGE_SX1699609X2X4", propOrder = {
    "shipplanid",
    "shipplanname",
    "plancarsqty"
})
public class APPSCUXCARMANAGESX1699609X2X4 {

    @XmlElementRef(name = "SHIP_PLAN_ID", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> shipplanid;
    @XmlElementRef(name = "SHIP_PLAN_NAME", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shipplanname;
    @XmlElementRef(name = "PLAN_CARS_QTY", namespace = "http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> plancarsqty;

    /**
     * 获取shipplanid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSHIPPLANID() {
        return shipplanid;
    }

    /**
     * 设置shipplanid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSHIPPLANID(JAXBElement<BigDecimal> value) {
        this.shipplanid = value;
    }

    /**
     * 获取shipplanname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSHIPPLANNAME() {
        return shipplanname;
    }

    /**
     * 设置shipplanname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSHIPPLANNAME(JAXBElement<String> value) {
        this.shipplanname = value;
    }

    /**
     * 获取plancarsqty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPLANCARSQTY() {
        return plancarsqty;
    }

    /**
     * 设置plancarsqty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPLANCARSQTY(JAXBElement<BigDecimal> value) {
        this.plancarsqty = value;
    }

}
