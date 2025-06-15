import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
	//Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	//	Formula
        if (n >= 1) {
            int formula = n * (n + 1) / 2;
            int sum = 0, i = 1;
			//Loops
            while (i <= n) {
               sum  += i;
                i++;
            }
	//Verification
            System.out.println("Sum using formula " + formula);
            System.out.println("Sum using while loop " + sum);
        }
    }
}

