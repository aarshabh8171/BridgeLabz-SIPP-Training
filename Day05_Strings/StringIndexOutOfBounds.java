import java.util.Scanner;

public class StringIndexOutOfBounds{

    //Method to generate the Exception (abruptly stops the program)
    public static void generateException(String text) {
        // Accessing index beyond the string length
        char ch = text.charAt(100); // Will throw StringIndexOutOfBoundsException
        System.out.println("Character at index 100: " + ch);
    }

    // Method to handle the Exception using try-catch
    public static void handleException(String text) {
        try {
            char ch = text.charAt(100); // Will throw exception
            System.out.println("Character at index 100: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();
        handleException(text);
    }
}
