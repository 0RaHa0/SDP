package Assignment_3_6;

public class TextCharacter {
    private char symbol;
    private String font;
    private int size;

    public TextCharacter(char symbol, String font, int size) {
        this.symbol = symbol;
        this.font = font;
        this.size = size;
    }
    public void render(int x, int y) {
        System.out.println("Rendering '" + symbol + "' at position (" + x + ", " + y + ") with font: " + font + " and size: " + size);
    }

}

