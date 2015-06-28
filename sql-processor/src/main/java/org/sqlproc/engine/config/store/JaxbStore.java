package org.sqlproc.engine.config.store;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbStore {
    private final File directory;
    private final String fileName;
    private final JAXBContext xmlContext;
    private final File file;

    protected JaxbStore(File directory, String fileName, Class<?>... jaxbClasses) throws IOException, JAXBException {
        this.directory = directory;
        this.fileName = fileName;
        this.xmlContext = JAXBContext.newInstance(jaxbClasses);

        this.directory.mkdirs();
        if (!this.directory.exists()) {
            throw new IOException("Could not create data directory: " + this.directory);
        }

        this.file = new File(this.directory, this.fileName);
    }

    protected void writeXml(Object xml) {
        try {
            Marshaller marshaller = this.xmlContext.createMarshaller();
            marshaller.marshal(xml, new File(this.directory, this.fileName));
        } catch (JAXBException ex) {
            throw new IllegalStateException("Could not save inventory", ex);
        }
    }

    protected Object readFile() throws JAXBException {
        System.out.println("Reading xml data from " + file);

        if (this.file.exists()) {
            Unmarshaller unmarshaller = this.xmlContext.createUnmarshaller();
            return unmarshaller.unmarshal(this.file);
        } else {
            return null;
        }
    }
}
