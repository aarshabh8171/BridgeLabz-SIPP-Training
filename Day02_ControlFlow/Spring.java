import java.util.Scanner;

public class Spring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//Input
        int month = sc.nextInt();
        int day = sc.nextInt();
	//Condition
        boolean isSpring = (month == 3 && day >= 20) || (month == 4 || month == 5) ||(month == 6 && day <= 20);
	//Printing 
        System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");
    }
}

