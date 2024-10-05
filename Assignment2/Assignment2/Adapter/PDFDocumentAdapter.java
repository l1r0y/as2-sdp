package Assignment2.Adapter;

import Assignment2.Document;

public class PDFDocumentAdapter implements Document {
    private PDFDocument pdfDocument;

    public PDFDocumentAdapter(String fileName) {
        this.pdfDocument = new PDFDocument(fileName);
    }

    @Override
    public void open() {
        pdfDocument.openPDF();
    }

    @Override
    public void display() {
        pdfDocument.showPDF();
    }
}