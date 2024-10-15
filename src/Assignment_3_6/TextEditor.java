package Assignment_3_6;

class TextEditor {
    private CharacterFactory characterFactory = new CharacterFactory();

    public void renderText(String text) {
        int x = 0;
        int y = 0;
        for (char c : text.toCharArray()) {
            TextCharacter character = characterFactory.getCharacter(c, "Arial", 12);
            character.render(x++, y);
        }
    }
}

