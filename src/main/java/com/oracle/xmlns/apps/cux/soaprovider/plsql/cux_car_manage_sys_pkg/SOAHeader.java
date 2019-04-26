
package com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="Responsibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RespApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecurityGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NLSLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Org_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "responsibility",
    "respApplication",
    "securityGroup",
    "nlsLanguage",
    "orgId"
})
@XmlRootElement(name = "SOAHeader")
public class SOAHeader {

    @XmlElement(name = "Responsibility")
    protected String responsibility;
    @XmlElement(name = "RespApplication")
    protected String respApplication;
    @XmlElement(name = "SecurityGroup")
    protected String securityGroup;
    @XmlElement(name = "NLSLanguage")
    protected String nlsLanguage;
    @XmlElement(name = "Org_Id")
    protected String orgId;

    /**
     * 获取responsibility属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibility() {
        return responsibility;
    }

    /**
     * 设置responsibility属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibility(String value) {
        this.responsibility = value;
    }

    /**
     * 获取respApplication属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespApplication() {
        return respApplication;
    }

    /**
     * 设置respApplication属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespApplication(String value) {
        this.respApplication = value;
    }

    /**
     * 获取securityGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityGroup() {
        return securityGroup;
    }

    /**
     * 设置securityGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityGroup(String value) {
        this.securityGroup = value;
    }

    /**
     * 获取nlsLanguage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNLSLanguage() {
        return nlsLanguage;
    }

    /**
     * 设置nlsLanguage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNLSLanguage(String value) {
        this.nlsLanguage = value;
    }

    /**
     * 获取orgId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置orgId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgId(String value) {
        this.orgId = value;
    }

}
