import java.util.Scanner;
public class NumberProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        for (int number : numbers) {
            if (number > 0) {
                System.out.print(number + " is Positive and ");
                System.out.println((number % 2 == 0) ? "Even" : "Odd");
            } else if (number < 0) {
                System.out.println(number + " is Negative");
            } else {
                System.out.println(number + " is Zero");
            }
        }
        if (numbers[0] == numbers[4])
            System.out.println("First and last are equal.");
        else if (numbers[0] > numbers[4])
            System.out.println("First is greater than last.");
        else
            System.out.println("First is less than last.");
    }
}
