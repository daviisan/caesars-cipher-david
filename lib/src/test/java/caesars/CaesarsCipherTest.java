package caesars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarsCipherTest {

	private CaesarsCipher caesarsCipher = new CaesarsCipher();
	@Test
	void testCipherMessageWithOffsetOf12() {
		assertEquals("mnopqrs", caesarsCipher.cipher("abcdefg", 12));
	}
	@Test
	void testemptyString() {
		assertEquals("", caesarsCipher.cipher("", 12));
	}
}
