package ErrorHandling.TryCatch;

public class Main {
    public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            int result = divide(10, 0); // Division by zero
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArithmeticException e) {
            // Handle ArithmeticException (division by zero)
            System.out.println("Error: Division by zero");
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}

