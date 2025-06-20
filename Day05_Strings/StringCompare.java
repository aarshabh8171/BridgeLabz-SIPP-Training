import java.util.Scanner;

public class StringCompare {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare using charAt()
        boolean resultCharAt = compareUsingCharAt(str1, str2);

        // Compare using equals() method
        boolean resultEquals = str1.equals(str2);

        // 3. Display both results
        System.out.println("Comparison using charAt(): " + resultCharAt);
        System.out.println("Comparison using equals(): " + resultEquals);

        // Check if both methods return the same result
        if (resultCharAt == resultEquals) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Methods give different results.");
        }
    }
}
