/**
 * This class contains some dumb methods for use with Strings.
 * Hence the name.
 * @author chris
 *
 */
public class DumbString {

	/**
	 * @param s String to check
	 * @return true if all chars in s are digits ('0'-'9') and false otherwise
	 */
	public static boolean allDigits(String s) {
		if(s == null) {
			return false;
		}
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c) == false)
				return false;
		}
		return true;
	}
	
	/**
	 * Determines the number of characters that the two parameters have in common
	 * @param a
	 * @param b
	 * @return the number of chars the two Strings have in common; -1 if either is null
	 */
	public static int charsInCommon(String a, String b) {
		if (a == null || b == null) return -1;
		int common = 0;

		// Get letter counts for each string
		int[] letterCount1 = new int[26], letterCount2 = new int[26];
		for (char c : a.toCharArray()) {
			letterCount1[c-'a'] ++;
		}
		for (char c: b.toCharArray()) {
			letterCount2[c-'a'] ++;
		}

		// The letters in common are the sum of the lower counts in each string
		for (int i = 0; i < 26; i ++) {
			common += Math.min(letterCount1[i], letterCount2[i]);
		}
		return common;
	}
	
}
