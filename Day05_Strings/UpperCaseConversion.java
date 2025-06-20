import java.util.Scanner;

public class UpperCaseConversion {

    // Method to convert lowercase characters to uppercase using ASCII logic
    public static String convertToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32); 
            } else {
                result += ch;
            }
        }
        return result;
    }

    //  Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Take full line input
        System.out.print("Enter the text: ");
        String input = sc.nextLine();

        // Convert using user-defined and built-in method
        String manualUpper = convertToUpperCase(input);
        String builtInUpper = input.toUpperCase();

        // Compare results
        boolean isSame = compareStrings(manualUpper, builtInUpper);

        // Display outputs
        System.out.println("Manual uppercase: " + manualUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);
        System.out.println("Are both results same? " + isSame);
    }
}
