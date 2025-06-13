package Day01_ProgrammingElement;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;

        System.out.print("Enter number 1: ");
        num1 = input.nextDouble();
        System.out.print("Enter number 2: ");
        num2 = input.nextDouble();

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));

        input.close();
    }
}



