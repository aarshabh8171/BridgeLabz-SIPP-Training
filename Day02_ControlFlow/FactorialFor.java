import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //Input
        int n = sc.nextInt();
//Loop
        if (n >= 0) {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
    //Printing Line
    
            System.out.println("Factorial of " + n + " is " + fact);
        } 
    }
}

