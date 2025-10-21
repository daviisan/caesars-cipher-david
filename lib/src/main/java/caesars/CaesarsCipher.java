package caesars;

public class CaesarsCipher {

	
	private static final char LETTER_A = 'a';
	private static final char LETTER_Z = 'z';
	private static final int ALPHABET_SIZE = 26;
	
	public String cipher (String message, int offset) {
		offset %= ALPHABET_SIZE;  //controls overflow
		char[] character = message.toCharArray(); //gets a message and converts it into a 
		//character which is then stored in the char[array]
		offsetBy(character, offset); //same as offset
		return new String(character);

	}

	private void offsetBy(char[] character, int offset) {
		for (int i = 0; i < character.length; ++i) {
			if (character[i] != ' ') {
			character[i] = offsetChar(character[i], offset, LETTER_A, LETTER_Z);
		    }
		
	    }
	}

	private char offsetChar(char c, int offset, char letterA, char letterZ) {
		c += offset;
		if (c < letterA) {
			return (char) (c + ALPHABET_SIZE);
		}
		if (c > letterZ) {
			return (char) (c - ALPHABET_SIZE);
		}
		return c;
	}

}
