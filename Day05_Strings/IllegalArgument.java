import java.util.Scanner;

public class IllegalArgument {

    //  Method to generate the Exception
    public static void generateException(String text) {
        // This will throw IllegalArgumentException at runtime
        String result = text.substring(5, 2); // start > end
        System.out.println("Substring: " + result);
    }

    // Method to handle the Exception using try-catch
    public static void handleException(String text) {
        try {
            String result = text.substring(5, 2); // start > end
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        //First call method to generate Exception

         handleException(text);
    }
}
