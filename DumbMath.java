/**
 * This class contains some dumb methods for doing math.
 * Hence the name.
 * @author chris
 *
 */

public class DumbMath {

	public static int add(int a, int b) {
		int sum = a + b;
		
		// check for overflow
		if (a > 0 && b > 0 && sum < 0)
			throw new ArithmeticException("Overflow when adding " + a + " and " + b);

		return sum;
	}


  public static double add(double a, double b) {
    double sum = a + b;

    // check for overflow
    if (a > 0 && b > 0 && sum < 0)
      throw new ArithmeticException("Overflow when adding " + a + " and " + b);

    return sum;
  }


	public static int multiply(int a, int b) {
		int product = a * b;
		return product;
	}
	

	public static double addFraction(int n1, int d1, int n2, int d2) {
		if (d1 == 0 || d2 == 0)
			throw new IllegalArgumentException("Denominator is zero!");
		
		double f1 = ((double)n1)/d1;
		double f2 = ((double)n2)/d2;
		return f1 + f2;
		
	}
}
