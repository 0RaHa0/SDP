package Assignment_3_6;

import java.util.HashMap;
import java.util.Map;

class CharacterFactory {
    private Map<Character, TextCharacter> characterMap = new HashMap<>();

    public TextCharacter getCharacter(char symbol, String font, int size) {
        TextCharacter character = characterMap.get(symbol);
        if (character == null) {
            character = new TextCharacter(symbol, font, size);
            characterMap.put(symbol, character);
            System.out.println("Creating character: " + symbol);
        }
        return character;
    }
}



