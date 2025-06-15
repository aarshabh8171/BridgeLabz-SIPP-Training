import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {
           //Input
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
//Condition
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}

