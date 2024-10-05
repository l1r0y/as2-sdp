package Assignment2.Flyweight;

import Assignment2.Document;
import Assignment2.RealDocument;

import java.util.HashMap; // Import HashMap
import java.util.Map; // Import Map

public class DocumentFactory {
    private static final Map<String, Document> documentMap = new HashMap<>();

    public static Document getDocumentByTitle(String title) {
        Document document = documentMap.get(title);

        if (document == null) {
            document = createDocument(title);
            documentMap.put(title, document);
        }

        return document;
    }

    private static Document createDocument(String title) {
        return new RealDocument(title);
    }
}