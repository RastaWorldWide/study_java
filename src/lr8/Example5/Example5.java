package lr8.Example5;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Example5 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("library");
            doc.appendChild(rootElement);

            Element book1 = doc.createElement("book");
            rootElement.appendChild(book1);

            Element author1 = doc.createElement("author");
            author1.appendChild(doc.createTextNode("Толстой"));
            book1.appendChild(author1);

            Element year1 = doc.createElement("year");
            year1.appendChild(doc.createTextNode("1867"));
            book1.appendChild(year1);

            Element name1 = doc.createElement("name");
            name1.appendChild(doc.createTextNode("Война и мир"));
            book1.appendChild(name1);

            Element book2 = doc.createElement("book");
            rootElement.appendChild(book2);

            Element author2 = doc.createElement("author");
            author2.appendChild(doc.createTextNode("Толкин"));
            book2.appendChild(author2);

            Element year2 = doc.createElement("year");
            year2.appendChild(doc.createTextNode("1954"));
            book2.appendChild(year2);

            Element name2 = doc.createElement("name");
            name2.appendChild(doc.createTextNode("Властелин колец"));
            book2.appendChild(name2);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new StreamResult(
                    new File("src/lr8/Example5/book.xml")
            );
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
