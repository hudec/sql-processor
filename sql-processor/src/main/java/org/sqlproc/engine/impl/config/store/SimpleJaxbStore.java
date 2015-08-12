package org.sqlproc.engine.impl.config.store;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is used only for the SQL Processor dynamic configuration serialization/deserialization.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class SimpleJaxbStore {

    /**
     * The internal slf4j logger.
     */
    final Logger logger = LoggerFactory.getLogger(getClass());

    private final String directory;
    private final String fileName;
    private final JAXBContext xmlContext;
    private final File file;

    public SimpleJaxbStore(String directory, String fileName, Class<?>... jaxbClasses) throws IOException,
            JAXBException {
        this.directory = substitute(directory);
        this.fileName = substitute(fileName);
        this.xmlContext = JAXBContext.newInstance(jaxbClasses);

        File dir = new File(this.directory);
        dir.mkdirs();
        if (!dir.exists()) {
            throw new IOException("Could not create data directory: " + this.directory);
        }

        this.file = new File(dir, this.fileName);
    }

    static String substitute(String s) {
        int ix = s.indexOf("${");
        int ix2 = (ix >= 0) ? s.indexOf("}", ix) : -1;
        if (ix < 0 || ix2 < 0)
            return s;
        String toSubstitute = s.substring(ix + 2, ix + ix2);
        String substituted = System.getenv(toSubstitute);
        if (substituted == null)
            substituted = System.getProperty(toSubstitute);
        if (substituted == null)
            return s;
        String result = s.substring(0, ix) + substituted + s.substring(ix + ix2 + 1);
        return result;
    }

    public boolean writeXml(Object xml) {
        logger.warn(">>> writeXml file={}, dir={}", file, directory);
        if (file == null)
            return false;
        logger.warn("=== writeXml xml={}", xml);
        try {
            Marshaller marshaller = this.xmlContext.createMarshaller();
            marshaller.marshal(xml, this.file);
        } catch (JAXBException ex) {
            throw new IllegalStateException("Could not save configuration", ex);
        }
        logger.warn("<<< writeXml xmlContext={}", xmlContext);
        return true;
    }

    public Object readXml() {
        logger.warn(">>> readXml file={}, dir={}", file, directory);
        if (file == null || !this.file.exists())
            return null;
        logger.warn("=== readXml xmlContext={}", xmlContext);
        Object xml = null;
        try {
            Unmarshaller unmarshaller = this.xmlContext.createUnmarshaller();
            xml = unmarshaller.unmarshal(this.file);
        } catch (JAXBException ex) {
            throw new IllegalStateException("Could not read configuration", ex);
        }
        logger.warn("<<< readXml xml={}", xml);
        return xml;
    }
}
