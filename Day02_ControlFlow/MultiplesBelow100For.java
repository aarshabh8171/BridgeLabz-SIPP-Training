import java.util.Scanner;

public class MultiplesBelow100For {
    public static void main(String[] args) {
           //Input
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
// Condition
        System.out.println("Multiples of " + number + " below 100:");
        for (int i = 1; i < 100; i++) {
            if (i % number == 0)
                System.out.println(i);
        }
    }
}

