import java.util.Scanner;

public class NumberAnalysis {

    // Method to check if number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers: returns 1 if number1 > number2, 0 if equal, -1 if number1 < number2
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

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                System.out.print(num + " is positive and ");
                if (isEven(num)) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println(num + " is negative.");
            }
        }

        int compResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (compResult == 1) {
            System.out.println("The first element is greater than the last element.");
        } else if (compResult == 0) {
            System.out.println("The first and last elements are equal.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        scanner.close();
    }
}
