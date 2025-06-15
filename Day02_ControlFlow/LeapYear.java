import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
	//Input
        Scanner sc = new Scanner(System.in);
       int year = sc.nextInt();
// Conditions
        if (year < 1582) {
            System.out.println("The Leap Year check only works for years from 1582 onward.");
        } else if (year % 4 != 0) {
            System.out.println(year + " is Not a Leap Year.");
        } else if (year % 100 != 0) {
            System.out.println(year + " is a Leap Year.");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }
    }
}