public class NumberChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is neon
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check if a number is spy
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is automorphic
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Method to check if a number is buzz
    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    public static void main(String[] args) {
        int[] testNumbers = {7, 9, 153, 5, 49, 1, 370, 25, 1729};

        for (int num : testNumbers) {
            System.out.println("Number: " + num);
            System.out.println("Is Prime? " + isPrime(num));
            System.out.println("Is Neon? " + isNeon(num));
            System.out.println("Is Spy? " + isSpy(num));
            System.out.println("Is Automorphic? " + isAutomorphic(num));
            System.out.println("Is Buzz? " + isBuzz(num));
            System.out.println();
        }
    }
}
