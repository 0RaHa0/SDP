package Task_410;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();

        editor.type("Hello ");
        history.save(editor);

        editor.type("World!");
        System.out.println("Content: " + editor.getContent());

        history.undo(editor);
        System.out.println("After undo: " + editor.getContent());
    }
}
