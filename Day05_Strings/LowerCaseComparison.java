import java.util.Scanner;

public class LowerCaseComparison {

    // Method to convert a string to lowercase using ASCII logic and charAt()
    public static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if character is uppercase using ASCII
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert to lowercase
            }
            result += ch;
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = inp.nextLine();

        // Built-in lowercase
        String builtInLower = text.toLowerCase();

        // User-defined lowercase
        String customLower = convertToLower(text);

        // Compare both strings
        boolean isSame = compareStrings(builtInLower, customLower);

        // Display result
        System.out.println("\nBuilt-in lowercase: " + builtInLower);
        System.out.println("Custom lowercase   : " + customLower);
        System.out.println("Strings Match?     : " + isSame);
    }
}
