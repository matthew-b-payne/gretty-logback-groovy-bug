package com.pennmutual.services.xml;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

@javax.xml.bind.annotation.XmlTransient
public class BaseXmlObject {
    public String toString() {
        Writer sw = new StringWriter();
        Writer bw = new BufferedWriter(sw);
        try {
            Marshaller m = XMLHelper.getContext(this.getClass()).createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            m.marshal(this, bw);
            return sw.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                bw.flush();
                bw.close();
            } catch (IOException e) {
            }
        }
    }
}
