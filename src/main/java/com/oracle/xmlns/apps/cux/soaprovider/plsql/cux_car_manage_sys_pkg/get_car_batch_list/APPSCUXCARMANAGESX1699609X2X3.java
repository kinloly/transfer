
package com.oracle.xmlns.apps.cux.soaprovider.plsql.cux_car_manage_sys_pkg.get_car_batch_list;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>APPS.CUX_CAR_MANAGE_SX1699609X2X3 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="APPS.CUX_CAR_MANAGE_SX1699609X2X3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XR_LINE_DATA_ITEM" type="{http://xmlns.oracle.com/apps/cux/soaprovider/plsql/cux_car_manage_sys_pkg/get_car_batch_list/}APPS.CUX_CAR_MANAGE_SX1699609X2X4" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APPS.CUX_CAR_MANAGE_SX1699609X2X3", propOrder = {
    "xrlinedataitem"
})
public class APPSCUXCARMANAGESX1699609X2X3 {

    @XmlElement(name = "XR_LINE_DATA_ITEM", nillable = true)
    protected List<APPSCUXCARMANAGESX1699609X2X4> xrlinedataitem;

    /**
     * Gets the value of the xrlinedataitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xrlinedataitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXRLINEDATAITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APPSCUXCARMANAGESX1699609X2X4 }
     * 
     * 
     */
    public List<APPSCUXCARMANAGESX1699609X2X4> getXRLINEDATAITEM() {
        if (xrlinedataitem == null) {
            xrlinedataitem = new ArrayList<APPSCUXCARMANAGESX1699609X2X4>();
        }
        return this.xrlinedataitem;
    }

}
