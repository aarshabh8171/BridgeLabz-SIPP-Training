import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        //Loops
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                System.out.println(i + " is " + (i % 2 == 0 ? "Even" : "Odd"));
            }
        } 
    }
}

