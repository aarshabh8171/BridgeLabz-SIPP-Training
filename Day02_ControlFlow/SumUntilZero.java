import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
	// Input
        Scanner sc = new Scanner(System.in);
        double num=sc.nextDouble();
        double total = 0, value;
//      Loop
        System.out.println("Enter numbers (0 to stop): ");
        while ((value = num ) != 0) {
            total += value;
        }
	//Output Statement
        System.out.println("Total sum: " + total);
    }
}

