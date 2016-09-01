import static org.junit.Assert.*;

import org.junit.Test;


public class DumbMathTest {

	@Test
	public void testAddPositiveAndNegative() {
		int a = 12;
		int b = -3;
		int expected = 9;
		int actual = DumbMath.add(a, b);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testAddNegativeAndNegative() {
		int a = -8;
		int b = -3;
		int expected = -11;
		int actual = DumbMath.add(a, b);
		assertEquals(expected, actual);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testAddIntegerOverflow() {
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		DumbMath.add(a, b);
	}

	@Test
	public void testAddFractionNumeratorZero() {
		int n1 = 0;
		int d1 = 5;
		int n2 = 3;
		int d2 = 4;
		double expected = 0.75;
		double actual = DumbMath.addFraction(n1, d1, n2, d2);
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testAddFractionHalfPlusThird() {
		int n1 = 1;
		int d1 = 2;
		int n2 = 1;
		int d2 = 3;
		double expected = 5.0/6;
		double actual = DumbMath.addFraction(n1, d1, n2, d2);
		assertEquals(expected, actual, 0.00000000001);
	}
	

	@Test
	public void testMultiplyTwoNegativeNumbers() {
		int n1 = -5;
		int n2 = -10;
		double expected = 50.0;
		double actual = DumbMath.multiply(n1, n2);
		assertEquals(expected, actual, 0.00000000001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddFractionDenominatorZero() {
		int frac1Numerator = 1;
		int frac1Denominator= 0; 
		int frac2Numerator = 1;
		int frac2Denominator = 4;
		double actual = DumbMath.addFraction(frac1Numerator, frac1Denominator, frac2Numerator, frac2Denominator);
	}

  @Test
  public void testAddDouble() {
      double a = 12.01;
      double b = 3.02;
      double expected = 15.03;
      double actual = DumbMath.add(a, b);
      assertEquals(expected, actual);
  }

}
