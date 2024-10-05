package Assignment2.Composite;

import Assignment2.Document;

import java.util.ArrayList;
import java.util.List;

public class DocumentGroup implements Document {
    private List<Document> documents = new ArrayList<>();

    public void addDocument(Document document) {
        documents.add(document);
    }

    public void removeDocument(Document document) {
        documents.remove(document);
    }

    @Override
    public void display() {
        for (Document doc : documents) {
            doc.display();  // Delegate the display to each document in the group
        }
    }

    @Override
    public void open() {

    }
}