import java.util.Scanner;

public class Harshad{
    public static void main(String[] args) {
	//Input
        Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

        int sum = 0;
        int temp = number;
	//Conditions
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
	//Validation
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }
    }
}