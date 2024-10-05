package Assignment2.Facade;

import Assignment2.Bridge.DocumentRenderer;
import Assignment2.Bridge.RenderEngine;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.Document;
import Assignment2.Flyweight.DocumentFactory;

public class DocumentFacade {

    public void displayDocument(String title) {
        Document document = DocumentFactory.getDocumentByTitle(title);
        if (document != null) {
            document.display();
        } else {
            System.out.println("No document");
        }
    }

    public void displayDocumentWithWatermark(String title) {
        Document document = DocumentFactory.getDocumentByTitle(title);
        if (document != null) {
            Document watermarkedDocument = new WatermarkDecorator(document);
            watermarkedDocument.display();
        } else {
            System.out.println("No document");
        }
    }

    public void renderDocument(String title, RenderEngine engine) {
        Document document = DocumentFactory.getDocumentByTitle(title);
        if (document != null) {
            DocumentRenderer renderer = new DocumentRenderer(engine) {
                @Override
                public void render(String content) {
                    System.out.println("Rendering with engine: " + content);
                }

                @Override
                public void renderDocument(String content) {

                }
            };


            renderer.render(document.toString());
        } else {
            System.out.println("No document");
        }
    }
}