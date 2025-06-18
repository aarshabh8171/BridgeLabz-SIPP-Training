import java.util.Arrays;

public class NumberCheckerUtility {

    // Method to find count of digits in a number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store digits of a number in an array
    public static int[] digitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays for equality
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if a number is palindrome using digits
    public static boolean isPalindrome(int number) {
        int[] digits = digitsArray(number);
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number (has a non-zero digit)
    public static boolean isDuckNumber(int number) {
        int[] digits = digitsArray(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int testNumber = 12321;

        System.out.println("Number: " + testNumber);
        System.out.println("Count of digits: " + countDigits(testNumber));
        System.out.println("Digits array: " + Arrays.toString(digitsArray(testNumber)));
        System.out.println("Reversed digits array: " + Arrays.toString(reverseArray(digitsArray(testNumber))));
        System.out.println("Is palindrome? " + isPalindrome(testNumber));
        System.out.println("Is duck number? " + isDuckNumber(testNumber));
    }
}
