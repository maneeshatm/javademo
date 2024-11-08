/**
 * The Calculator class provides methods to perform basic arithmetic operations.
 */
/**this is new */
/** first */
public class Calculator {

    /**
     * Adds two numbers together.
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return the sum of a and b
     * @author
     */
    public int add(int a, int b , int c) {
        return a + b +c;
    }

    /**
     * Subtracts the second number from the first.
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return the difference of a and b
     */
    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first number by the second.
     *
     * @param a the numerator
     * @param b the denominator
     * @return the quotient of a and b
     * @throws ArithmeticException if b is zero
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    /**
     * Main method to demonstrate the Calculator functionality.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        System.out.println("Division: " + calculator.divide(5, 3));
    }
}
