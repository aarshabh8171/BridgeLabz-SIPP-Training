import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
	//Input
        Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

        int sum = 0;
        int originalNumber = number;
//Conditions
        while (originalNumber != 0) {
            int digit = originalNumber % 10;         
            sum += digit * digit * digit;            
            originalNumber = originalNumber / 10;    
        }
//Validation
        if (sum == number)
            System.out.println(number + " is an Armstrong Number.");
        else
            System.out.println(number + " is Not an Armstrong Number.");
    }
}