import java.util.Scanner;

public class LeapYearIf {
    public static void main(String[] args) {
	//Input
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
// Conditions
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }
    }
}