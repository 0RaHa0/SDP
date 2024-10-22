package Task_48;

class DocumentExportVisitor implements DocumentVisitor {
    public void visit(WordDocument doc) {
        doc.exportToWord();
    }

    public void visit(PDFDocument doc) {
        doc.exportToPDF();
    }
}
