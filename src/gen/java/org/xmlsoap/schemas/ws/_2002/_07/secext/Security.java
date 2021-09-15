
package org.xmlsoap.schemas.ws._2002._07.secext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Security complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Security"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UsernameToken" type="{http://schemas.xmlsoap.org/ws/2002/07/secext}UsernameToken" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Security", propOrder = {
    "usernameToken"
})
public class Security {

    @XmlElement(name = "UsernameToken")
    protected org.xmlsoap.schemas.ws._2002._07.secext.UsernameToken usernameToken;

    /**
     * Gets the value of the usernameToken property.
     * 
     * @return
     *     possible object is
     *     {@link UsernameToken }
     *     
     */
    public org.xmlsoap.schemas.ws._2002._07.secext.UsernameToken getUsernameToken() {
        return usernameToken;
    }

    /**
     * Sets the value of the usernameToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsernameToken }
     *     
     */
    public void setUsernameToken(org.xmlsoap.schemas.ws._2002._07.secext.UsernameToken value) {
        this.usernameToken = value;
    }

}
