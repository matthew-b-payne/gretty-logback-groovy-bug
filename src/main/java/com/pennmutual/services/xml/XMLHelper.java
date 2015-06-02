package com.pennmutual.services.xml;

import com.google.common.collect.MapMaker;
import org.w3c.dom.Node;

import javax.xml.bind.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.util.concurrent.ConcurrentMap;

public enum XMLHelper {
    INSTANCE;
    private ConcurrentMap<String,JAXBContext> contexts;
    XMLHelper() throws ExceptionInInitializerError {
            contexts = new MapMaker().makeMap();
    }

    public static<T> String marshal(JAXBElement<T> e) throws JAXBException {
        StringWriter sw = new StringWriter();
        Writer bw = new BufferedWriter(sw);
        getMarshaller(e).marshal(e,bw);
        return sw.toString();
    }
    public static String marshal(Node node) throws JAXBException, TransformerException, IOException {
        Writer sw = new StringWriter();
        Writer bw = new BufferedWriter(sw);
        try {
            Transformer t = TransformerFactory.newInstance().newTransformer();
            t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            t.setOutputProperty(OutputKeys.INDENT, "yes");
            t.transform(new DOMSource(node), new StreamResult(sw));
            bw.flush();
            bw.close();
        } finally {
            try { sw.close(); } catch (IOException e) {}
        }
        return sw.toString();
    }
    public static <T> JAXBElement<T> unmarshal(String xml, Class<T> cls) throws JAXBException {
        Source ss = new StreamSource(new StringReader(xml));
        return getContext(cls).createUnmarshaller().unmarshal(ss, cls);
    }
    public static <T> JAXBElement<T> unmarshal(File file, Class<T> cls) throws JAXBException {
        Source ss = new StreamSource(file);
        return getContext(cls).createUnmarshaller().unmarshal(ss, cls);
    }

    public static JAXBContext getContext(Class<?> cl) throws JAXBException {
        final String pkgName = cl.getPackage().getName();
        JAXBContext jc = INSTANCE.contexts.get(pkgName);
        if(jc == null) {
            final JAXBContext jaxbContext = JAXBContext.newInstance(pkgName);
            jc = INSTANCE.contexts.putIfAbsent(pkgName,jaxbContext);
            if(jc == null) { jc = jaxbContext; }
        }
        return jc;
    }

    public static<T> Unmarshaller getUnmarshaller(JAXBElement<T> e) throws JAXBException {
        return getContext(e.getValue().getClass()).createUnmarshaller();
    }
    public static<T> Marshaller getMarshaller(JAXBElement<T> e) throws JAXBException {
        Marshaller m = getContext(e.getValue().getClass()).createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        m.setProperty(Marshaller.JAXB_FRAGMENT,Boolean.TRUE);
        return m;
    }
}
