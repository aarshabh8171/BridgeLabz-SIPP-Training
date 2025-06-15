import java.util.Scanner;

public class Abundant{
    public static void main(String[] args) {
	//Input
        Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
 int sum = 0;
	//Conditions
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
    }
}