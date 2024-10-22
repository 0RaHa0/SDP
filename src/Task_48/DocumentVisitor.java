package Task_48;

interface DocumentVisitor {
    void visit(WordDocument doc);
    void visit(PDFDocument doc);
}
