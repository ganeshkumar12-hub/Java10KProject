package exceptionHandling;
//Exception handling is a mechanism in Java used to handle runtime errors so that the program does not terminate suddenly.
public class eHex {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues...");
    }
}