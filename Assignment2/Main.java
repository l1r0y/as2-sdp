package Assignment2;

import Assignment2.Facade.DocumentFacade;
import Assignment2.Composite.DocumentGroup;
import Assignment2.Adapter.PDFDocumentAdapter;
import Assignment2.Bridge.RenderEngine;
import Assignment2.Bridge.SimpleRenderEngine;
import Assignment2.Bridge.HighlightRenderEngine;
import Assignment2.Flyweight.DocumentFactory;

public class Main {
    public static void main(String[] args) {

        // Создание фасада для управления документами
        DocumentFacade documentFacade = new DocumentFacade();

        // Пример использования паттерна Proxy для ленивой загрузки документа
        System.out.println("== Ленивая загрузка документа (Proxy) ==");
        documentFacade.displayDocument("Report");

        // Пример использования паттерна Decorator для добавления водяного знака
        System.out.println("\n== Добавление водяного знака в документ (Decorator) ==");
        documentFacade.displayDocumentWithWatermark("Report");

        // Пример использования паттерна Flyweight для повторного использования документа
        System.out.println("\n== Повторное использование уже загруженного документа (Flyweight) ==");
        documentFacade.displayDocument("Report");

        // Пример использования паттерна Composite для работы с группами документов
        System.out.println("\n== Работа с набором документов (Composite) ==");
        DocumentGroup documentGroup = new DocumentGroup();
        documentGroup.addDocument(DocumentFactory.getDocumentByTitle("Report"));
        documentGroup.addDocument(DocumentFactory.getDocumentByTitle("Presentation"));
        documentGroup.display();

        // Пример использования паттерна Adapter для работы с PDF-документами
        System.out.println("\n== Работа с PDF-документом через адаптер (Adapter) ==");
        Document pdfDocument = new PDFDocumentAdapter("document.pdf");
        pdfDocument.display();

        // Пример использования паттерна Bridge для разных видов рендеринга документа
        System.out.println("\n== Рендеринг документа через различные движки (Bridge) ==");

        // Рендеринг через обычный движок
        RenderEngine simpleRenderEngine = new SimpleRenderEngine();
        documentFacade.renderDocument("Report", simpleRenderEngine);

        // Рендеринг через движок с подсветкой
        RenderEngine highlightRenderEngine = new HighlightRenderEngine();
        documentFacade.renderDocument("Report", highlightRenderEngine);
    }
}