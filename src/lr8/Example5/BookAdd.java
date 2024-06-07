package lr8.Example5;

import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BookAdd {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lr8/Example5/book.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("Year: ");
            String year = scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            Element root = doc.getDocumentElement();

            Element book = doc.createElement("book");

            Element nameElement = doc.createElement("author");
            nameElement.appendChild(doc.createTextNode(author));
            book.appendChild(nameElement);

            Element kindElement = doc.createElement("year");
            kindElement.appendChild(doc.createTextNode(year));
            book.appendChild(kindElement);

            Element breedElement = doc.createElement("name");
            breedElement.appendChild(doc.createTextNode(name));
            book.appendChild(breedElement);

            root.appendChild(book);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lr8/Example5/book.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
