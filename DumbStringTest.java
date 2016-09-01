import static org.junit.Assert.*;

import org.junit.Test;


public class DumbStringTest {

	@Test
	public void testAllDigitsTrue() {
		DumbString ds = new DumbString();
		String s = "12345";
		assertTrue(ds.allDigits(s));
	}

	@Test
	public void testAllDigitsFalse() {
		DumbString ds = new DumbString();
		String s = "abcd5";
		assertFalse(ds.allDigits(s));
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
