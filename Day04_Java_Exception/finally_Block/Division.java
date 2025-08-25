package Day04_Java_Exception.finally_Block;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number 1: "); int num1 = sc.nextInt();
            System.out.print("Enter number 2: "); int num2 = sc.nextInt();
            System.out.println("Result: " + (num1 / num2));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            System.out.println("Operation completed");
        }
        sc.close();
    }
}
