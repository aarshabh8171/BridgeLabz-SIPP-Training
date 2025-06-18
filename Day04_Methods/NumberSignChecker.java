import java.util.Scanner;

public class NumberSignChecker {

    // Method to check if number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    // Returns 1 if number1 > number2, 0 if equal, -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is positive and even.");
                } else {
                    System.out.println(numbers[i] + " is positive and odd.");
                }
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        int comparison = compare(numbers[0], numbers[4]);
        if (comparison == 1) {
            System.out.println("The first element (" + numbers[0] + ") is greater than the last element (" + numbers[4] + ").");
        } else if (comparison == 0) {
            System.out.println("The first element (" + numbers[0] + ") is equal to the last element (" + numbers[4] + ").");
        } else {
            System.out.println("The first element (" + numbers[0] + ") is less than the last element (" + numbers[4] + ").");
        }

        scanner.close();
    }
}
