import java.util.Scanner;

public class ArrayIndex{

    //Method to generate the Exception
    public static void generateException(String[] names) {
        // This will throw ArrayIndexOutOfBoundsException
        String name = names[10]; // access index > array length
        System.out.println("Name at index 10: " + name);
    }

    // Method to handle the Exception using try-catch
    public static void handleException(String[] names) {
        try {
            String name = names[10]; // access index > array length
            System.out.println("Name at index 10: " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Take user input for names
        String[] names = new String[5];
        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            names[i] = sc.nextLine();
        }
        handleException(names);
    }
}
