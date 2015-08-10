package org.sqlproc.engine.config.store;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * This class is used only for the SQL Processor dynamic configuration serialization/deserialization.
 * 
 * <p>
 * For more info please see the <a href="https://github.com/hudec/sql-processor/wiki">Tutorials</a>.
 * 
 * @author <a href="mailto:Vladimir.Hudec@gmail.com">Vladimir Hudec</a>
 */
public class JaxbStore {
    private final String directory;
    private final String fileName;
    private final JAXBContext xmlContext;
    private final File file;

    protected JaxbStore() {
        this.directory = null;
        this.fileName = null;
        this.xmlContext = null;
        this.file = null;
    }

    protected JaxbStore(String directory, String fileName, Class<?>... jaxbClasses) throws IOException, JAXBException {
        this.directory = substitute(directory);
        this.fileName = substitute(fileName);
        this.xmlContext = JAXBContext.newInstance(jaxbClasses);

        File dir = new File(directory);
        dir.mkdirs();
        if (!dir.exists()) {
            throw new IOException("Could not create data directory: " + this.directory);
        }

        this.file = new File(dir, this.fileName);
    }

    protected static String substitute(String s) {
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

    protected void writeXml(Object xml) {
        if (file == null)
            return;
        try {
            Marshaller marshaller = this.xmlContext.createMarshaller();
            marshaller.marshal(xml, new File(this.directory, this.fileName));
        } catch (JAXBException ex) {
            throw new IllegalStateException("Could not save configuration", ex);
        }
    }

    protected Object readFile() throws JAXBException {
        if (file == null || !this.file.exists())
            return null;
        Unmarshaller unmarshaller = this.xmlContext.createUnmarshaller();
        return unmarshaller.unmarshal(this.file);
    }
}
