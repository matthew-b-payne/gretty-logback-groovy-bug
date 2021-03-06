//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.10 at 03:28:52 PM EDT 
//


package com.pml.services.security;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.pennmutual.services.xml.BaseXmlObject;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primaryJob" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "payGroupName",
    "payGroupCode",
    "companyCode",
    "primaryJob"
})
@XmlRootElement(name = "payGroup", namespace = "security.services.pml.com")
public class PayGroup
    extends BaseXmlObject
{

    @XmlElement(namespace = "security.services.pml.com", required = true)
    protected String payGroupName;
    @XmlElement(namespace = "security.services.pml.com", required = true)
    protected String payGroupCode;
    @XmlElement(namespace = "security.services.pml.com", required = true)
    protected String companyCode;
    @XmlElement(namespace = "security.services.pml.com", defaultValue = "false")
    protected boolean primaryJob;

    /**
     * Gets the value of the payGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayGroupName() {
        return payGroupName;
    }

    /**
     * Sets the value of the payGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayGroupName(String value) {
        this.payGroupName = value;
    }

    /**
     * Gets the value of the payGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayGroupCode() {
        return payGroupCode;
    }

    /**
     * Sets the value of the payGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayGroupCode(String value) {
        this.payGroupCode = value;
    }

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the primaryJob property.
     * 
     */
    public boolean isPrimaryJob() {
        return primaryJob;
    }

    /**
     * Sets the value of the primaryJob property.
     * 
     */
    public void setPrimaryJob(boolean value) {
        this.primaryJob = value;
    }

    public PayGroup withPayGroupName(String value) {
        setPayGroupName(value);
        return this;
    }

    public PayGroup withPayGroupCode(String value) {
        setPayGroupCode(value);
        return this;
    }

    public PayGroup withCompanyCode(String value) {
        setCompanyCode(value);
        return this;
    }

    public PayGroup withPrimaryJob(boolean value) {
        setPrimaryJob(value);
        return this;
    }

}
