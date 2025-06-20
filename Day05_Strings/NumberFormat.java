import java.util.Scanner;

public class NumberFormat{

    // Method to generate the Exception
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not a number
        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }

    // Method to handle the Exception using try-catch
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Take user input as String
        System.out.print("Enter a number in text form: ");
        String text = sc.nextLine();
        handleException(text);
    }
}
