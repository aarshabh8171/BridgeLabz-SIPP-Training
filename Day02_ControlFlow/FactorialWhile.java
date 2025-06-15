import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    // Condition and loop
        if (n >= 0) {
            long fact = 1;
            int i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
    //Output
            System.out.println("Factorial of " + n + " is " + fact);
        } 
    }
}
