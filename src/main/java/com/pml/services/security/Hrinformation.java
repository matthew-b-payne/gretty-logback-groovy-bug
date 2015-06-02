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
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costCenterCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costCenterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "title",
    "employeeStatus",
    "costCenterCode",
    "costCenterName",
    "department",
    "departmentCode"
})
@XmlRootElement(name = "hrinformation", namespace = "security.services.pml.com")
public class Hrinformation
    extends BaseXmlObject
{

    @XmlElement(namespace = "security.services.pml.com")
    protected String title;
    @XmlElement(namespace = "security.services.pml.com")
    protected String employeeStatus;
    @XmlElement(namespace = "security.services.pml.com")
    protected String costCenterCode;
    @XmlElement(namespace = "security.services.pml.com")
    protected String costCenterName;
    @XmlElement(namespace = "security.services.pml.com")
    protected String department;
    @XmlElement(namespace = "security.services.pml.com")
    protected String departmentCode;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the employeeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeStatus() {
        return employeeStatus;
    }

    /**
     * Sets the value of the employeeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeStatus(String value) {
        this.employeeStatus = value;
    }

    /**
     * Gets the value of the costCenterCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterCode() {
        return costCenterCode;
    }

    /**
     * Sets the value of the costCenterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterCode(String value) {
        this.costCenterCode = value;
    }

    /**
     * Gets the value of the costCenterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterName() {
        return costCenterName;
    }

    /**
     * Sets the value of the costCenterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterName(String value) {
        this.costCenterName = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the departmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentCode() {
        return departmentCode;
    }

    /**
     * Sets the value of the departmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentCode(String value) {
        this.departmentCode = value;
    }

    public Hrinformation withTitle(String value) {
        setTitle(value);
        return this;
    }

    public Hrinformation withEmployeeStatus(String value) {
        setEmployeeStatus(value);
        return this;
    }

    public Hrinformation withCostCenterCode(String value) {
        setCostCenterCode(value);
        return this;
    }

    public Hrinformation withCostCenterName(String value) {
        setCostCenterName(value);
        return this;
    }

    public Hrinformation withDepartment(String value) {
        setDepartment(value);
        return this;
    }

    public Hrinformation withDepartmentCode(String value) {
        setDepartmentCode(value);
        return this;
    }

}