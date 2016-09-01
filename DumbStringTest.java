import static org.junit.Assert.*;

import org.junit.Test;


public class DumbStringTest {

	@Test
	public void testAllDigitsTrue() {
		String s = "12345";
		assertTrue(DumbString.allDigits(s));
	}

	@Test
	public void testAllDigitsFalse() {
		String s = "abcd5";
		assertFalse(DumbString.allDigits(s));
	}
	
	@Test
	public void testCharsInCommonDoubleCount() {
		String a = "aa";
		String b = "ba";
		int expected = 1;
		int actual = DumbString.charsInCommon(a, b);
		assertEquals(expected, actual);
	}
	
}
