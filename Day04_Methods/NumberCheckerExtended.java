import java.util.Arrays;

public class NumberCheckerExtended {

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

    // Method to find sum of digits using digits array
    public static int sumOfDigits(int number) {
        int[] digits = digitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find sum of squares of digits using Math.pow()
    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = digitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    // Method to find frequency of each digit in the number
    // Returns a 2D array: first column digit, second column frequency
    public static int[][] digitFrequency(int number) {
        int[] digits = digitsArray(number);
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }
        int count = 0;
        for (int f : freq) {
            if (f > 0) count++;
        }
        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int testNumber = 1729;

        System.out.println("Number: " + testNumber);
        System.out.println("Count of digits: " + countDigits(testNumber));
        System.out.println("Digits array: " + Arrays.toString(digitsArray(testNumber)));
        System.out.println("Sum of digits: " + sumOfDigits(testNumber));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(testNumber));
        System.out.println("Is Harshad number? " + isHarshadNumber(testNumber));

        int[][] freq = digitFrequency(testNumber);
        System.out.println("Digit frequencies:");
        for (int[] pair : freq) {
            System.out.println("Digit " + pair[0] + ": " + pair[1]);
        }
    }
}
