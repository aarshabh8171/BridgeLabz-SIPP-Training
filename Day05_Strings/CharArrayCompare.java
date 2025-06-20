import java.util.Scanner;

public class CharArrayCompare{

    // Method to return characters from a string without using toCharArray()
    public static char[] getCharacters(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Use user-defined method
        char[] userChars = getCharacters(text);

        // Use built-in toCharArray()
        char[] builtInChars = text.toCharArray();

        // Compare both arrays
        boolean areSame = compareCharArrays(userChars, builtInChars);

        //Display results
        System.out.println("Characters using user-defined method:");
        for (char c : userChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nCharacters using toCharArray():");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both arrays equal? " + areSame);
    }
}
