import java.util.Arrays;

public class NumberCheckerAdvanced {

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

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = digitsArray(number);
        int n = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, n);
        }
        return sum == number;
    }

    // Method to find largest and second largest digits
    public static int[] largestAndSecondLargest(int number) {
        int[] digits = digitsArray(number);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digits
    public static int[] smallestAndSecondSmallest(int number) {
        int[] digits = digitsArray(number);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int testNumber = 153;

        System.out.println("Number: " + testNumber);
        System.out.println("Count of digits: " + countDigits(testNumber));
        System.out.println("Digits array: " + Arrays.toString(digitsArray(testNumber)));
        System.out.println("Is duck number? " + isDuckNumber(testNumber));
        System.out.println("Is Armstrong number? " + isArmstrongNumber(testNumber));

        int[] largest = largestAndSecondLargest(testNumber);
        System.out.println("Largest digit: " + largest[0] + ", Second largest digit: " + largest[1]);

        int[] smallest = smallestAndSecondSmallest(testNumber);
        System.out.println("Smallest digit: " + smallest[0] + ", Second smallest digit: " + smallest[1]);
    }
}
