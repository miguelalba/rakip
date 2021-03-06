import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.net.URL;


/**
 * Load and validate XML examples against schema.
 */
public class ExampleTest {

    @Test
    public void testSamples() throws SAXException, IOException {

        // Load schema and create validator
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        URL resource = ExampleTest.class.getResource("GenericModel1.0.3.xsd");
        File schemaFile = new File(resource.getFile());

        Schema schema = factory.newSchema(schemaFile);
        Validator validator = schema.newValidator();

        // Test generic model
        File sample0 = new File(ExampleTest.class.getResource("sample0.xml").getFile());
        validator.validate(new StreamSource(sample0));

        // Test dose response model
        File sample1 = new File(ExampleTest.class.getResource("sample1.xml").getFile());
        validator.validate(new StreamSource(sample1));
    }
}
