package caesars;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type in the message to Cipher:");
		
		String message = scan.nextLine();
				
		int offset = 12;
		
		CaesarsCipher caesarsCipher = new CaesarsCipher();
		
		String cipheredMessage = caesarsCipher.cipher(message, offset);
		
		System.out.println("Message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered message: " + cipheredMessage);

	}

}
