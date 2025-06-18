
public class NumberCheckerPerfectStrong {

    // Method to find sum of proper divisors of a number
    public static int sumOfProperDivisors(int number) {
        int sum = 1; // 1 is always a proper divisor (except for 1 itself)
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check if a number is perfect
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) return false;
        return sumOfProperDivisors(number) == number;
    }

    // Method to check if a number is abundant
    public static boolean isAbundantNumber(int number) {
        if (number <= 1) return false;
        return sumOfProperDivisors(number) > number;
    }

    // Method to check if a number is deficient
    public static boolean isDeficientNumber(int number) {
        if (number <= 1) return false;
        return sumOfProperDivisors(number) < number;
    }

    // Method to calculate factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 2; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        int[] testNumbers = {6, 12, 15, 145};

        for (int number : testNumbers) {
            System.out.println("Number: " + number);
            System.out.println("Is perfect number? " + isPerfectNumber(number));
            System.out.println("Is abundant number? " + isAbundantNumber(number));
            System.out.println("Is deficient number? " + isDeficientNumber(number));
            System.out.println("Is strong number? " + isStrongNumber(number));
            System.out.println();
        }
    }
}
