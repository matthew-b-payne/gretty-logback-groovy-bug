//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.10 at 03:28:52 PM EDT 
//


package com.pml.services.security;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Boolean>
{


    public Boolean unmarshal(String value) {
        return (com.pennmutual.services.xml.YNBooleanAdapterStatic.parseStringToBoolean(value));
    }

    public String marshal(Boolean value) {
        return (com.pennmutual.services.xml.YNBooleanAdapterStatic.printStringToBoolean(value));
    }

}
