/**
 * This class contains some dumb methods for doing math.
 * Hence the name.
 * @author chris
 *
 */

public class DumbMath {

    /**
     add(int a, int b)
     Adds two integers a, b together and returns the result
     */
    
    public static int add(int a, int b) {
        int sum = a + b;
        
        // check for overflow
        if (a > 0 && b > 0 && sum < 0)
            throw new ArithmeticException("Overflow when adding " + a + " and " + b);
        // check for underflow
        if (a < 0 && b < 0 && sum > 0)
            throw new ArithmeticException("Underflow when adding " + a + " and " + b);
        return sum;
    }
    
    /**
     add(double a, double b)
     Adds two doubles a, b together and returns the result
     */
    
    public static double add(double a, double b) {
    double sum = a + b;

    // check for overflow
    if (Double.isInfinite(sum))
      throw new ArithmeticException("Overflow when adding " + a + " and " + b);
    // check for underflow
    if (Double.isInfinite(1/sum))
        throw new ArithmeticException("Underflow when adding " + a + " and " + b);
    System.out.println(sum);
    return sum;
  }


    /**
     multiply(int a, int b)
     Multiplies two numbers a, b together and returns the result
     */
	public static int multiply(int a, int b) {
		int product = a * b;
		return product;
	}

    /**
     addFraction(int n1, int d1, int n2, int d2)
     Adds two fractions n1/d1 and n2/d2 together
     returns the resulting sum which has the value
     n1/d1 + n2/d2
     */

	public static double addFraction(int n1, int d1, int n2, int d2) {
		if (d1 == 0 || d2 == 0)
			throw new IllegalArgumentException("Denominator is zero!");

		double f1 = ((double)n1)/d1;
		double f2 = ((double)n2)/d2;
		return f1 + f2;

	}
}
