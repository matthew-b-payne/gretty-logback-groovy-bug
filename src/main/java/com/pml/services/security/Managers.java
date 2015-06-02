//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.10 at 03:28:52 PM EDT 
//


package com.pml.services.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
 *         &lt;element ref="{security.services.pml.com}manager" maxOccurs="unbounded" minOccurs="0"/>
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
    "managers"
})
@XmlRootElement(name = "managers", namespace = "security.services.pml.com")
public class Managers
    extends BaseXmlObject
{

    @XmlElement(name = "manager", namespace = "security.services.pml.com")
    protected List<Manager> managers;

    /**
     * Gets the value of the managers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Manager }
     * 
     * 
     */
    public List<Manager> getManagers() {
        if (managers == null) {
            managers = new ArrayList<Manager>();
        }
        return this.managers;
    }

    public Managers withManagers(Manager... values) {
        if (values!= null) {
            for (Manager value: values) {
                getManagers().add(value);
            }
        }
        return this;
    }

    public Managers withManagers(Collection<Manager> values) {
        if (values!= null) {
            getManagers().addAll(values);
        }
        return this;
    }

}