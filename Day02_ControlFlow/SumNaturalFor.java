import java.util.Scanner;

public class SumNaturalFor {
    public static void main(String[] args) {
// Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//With formula
        if (n >= 1) {
            int formulaSum = n * (n + 1) / 2;
            int forSum = 0;
//Loop
            for (int i = 1; i <= n; i++) {
                forSum += i;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + forSum);
         }
    }
}

