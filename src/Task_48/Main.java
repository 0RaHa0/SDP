package Task_48;

public class Main {
    public static void main(String[] args) {
        Document wordDoc = new WordDocument();
        Document pdfDoc = new PDFDocument();

        DocumentVisitor exportVisitor = new DocumentExportVisitor();

        wordDoc.accept(exportVisitor);
        pdfDoc.accept(exportVisitor);
    }
}
