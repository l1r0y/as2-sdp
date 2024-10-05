package Assignment2.Adapter;

public class PDFDocument {
    private String fileName;

    public PDFDocument(String fileName) {
        this.fileName = fileName;
    }

    public void openPDF() {
        System.out.println("Opening PDF document: " + fileName);
    }

    public void showPDF() {
        System.out.println("Displaying PDF content: " + fileName);
    }
}