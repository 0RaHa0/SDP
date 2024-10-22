package Task_410;

class TextEditor {
    private String content = "";

    public void type(String text) {
        content += text;
    }

    public String getContent() {
        return content;
    }

    public TextMemento save() {
        return new TextMemento(content);
    }

    public void restore(TextMemento memento) {
        content = memento.getState();
    }
}