import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
           //Input
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

//Condition
        int i = 1;
        System.out.println("Multiples of " + number + " below 100:");
        while (i < 100) {
            if (i % number == 0)
                System.out.println(i);
            i++;
        }
    }
}

