package Task_48;

class WordDocument implements Document {
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

    public void exportToWord() {
        System.out.println("Exporting Word Document...");
    }
}

class PDFDocument implements Document {
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

    public void exportToPDF() {
        System.out.println("Exporting PDF Document...");
    }
}
