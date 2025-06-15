import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;
//Condition
        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}

