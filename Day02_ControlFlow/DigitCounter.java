import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
	//Input
        Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
        
        int count = 0;
        int original = Math.abs(number); 
	//Conditions
        if (original == 0) {
            count = 1; 
        } else {
            while (original != 0) {
                original = original / 10; 
                count++;                 
            }
        }

        System.out.println("Number of digits " + count);
    }
}