//@author Shamyr Douglas
public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	//below code uses loops and if statements to check if character in plainText is lower than
	//LOWER_BOUND or above UPPER_BOUND
	public static boolean stringInBounds (String plainText) {
		for (int i = 0; i < plainText.length() - 1; i++) {
			if (plainText.charAt(i) < LOWER_BOUND || plainText.charAt(i) > UPPER_BOUND)
				return false;
		else 
			return true;
		}
		throw new RuntimeException("method not implemented");
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	//below code uses variables, loops, and if statements to run through plainText and add the
	//integer key to it, for Caesar encryption
	public static String encryptCaesar(String plainText, int key) {
		int val1;	
		String str1;
		String str2 = "";
		
		for (int i = 0; i < plainText.length(); i++) {
			val1 = (int)plainText.charAt(i) + key;
			if (val1 > UPPER_BOUND) {
				val1 -= RANGE;
			}
			str1 = Character.toString(val1);
			str2 += str1;
		}
			return str2;
		//throw new RuntimeException("method not implemented");
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	//below code uses variables, loops, and if statements to run through 
	//the plainText and add the bellasoStr to it, for Bellaso encryption

	public static String encryptBellaso(String plainText, String bellasoStr) {
		//throw new RuntimeException("method not implemented");
		int val1;	
		String str1;
		String str2 = "";
		String str3 = bellasoStr;
		
		for (int i = 0; i < plainText.length(); i++) {
			if (bellasoStr.length() < plainText.length()) {
				str3 += bellasoStr;
			}
			val1 = (int)plainText.charAt(i) + (int)str3.charAt(i);
			
			
			while (val1 > UPPER_BOUND) {
				val1 -= RANGE;
			}
			str1 = Character.toString(val1);
			str2 += str1;
		}
			return str2;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	//below code uses variables, loops, and if statements to run through encrpytedText and subtract the
	//integer key from it, for Caesar decryption
	public static String decryptCaesar(String encryptedText, int key) {
		//throw new RuntimeException("method not implemented");	
		int val1;	
		String str1;
		String str2 = "";
		
		for (int i = 0; i < encryptedText.length(); i++) {
			val1 = (int)encryptedText.charAt(i) - key;
			if (val1 < LOWER_BOUND) {
				val1 += RANGE;
			}
			str1 = Character.toString(val1);
			str2 += str1;
		}
			return str2;
	}

	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	//below code uses variables, loops, and if statements to run through 
	//the encryptedText and subtract the bellasoStr from it, for Bellaso decryption
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		//throw new RuntimeException("method not implemented");
		int val1;	
		String str1;
		String str2 = "";
		String str3 = bellasoStr;
		
		for (int i = 0; i < encryptedText.length(); i++) {
			if (bellasoStr.length() < encryptedText.length()) {
				str3 += bellasoStr;
			}
			val1 = (int)encryptedText.charAt(i) - (int)str3.charAt(i);
			
			
			while (val1 < LOWER_BOUND) {
				val1 += RANGE;
			}
			str1 = Character.toString(val1);
			str2 += str1;
		}
			return str2;
	}
}
