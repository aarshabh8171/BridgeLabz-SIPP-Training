import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {   
        //Input
         Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

// Condition

 int i = 1;
        System.out.println("Factors of " + number + ":");
        while (i <= number) {
            if (number % i == 0)
                System.out.println(i);
            i++;
        }
    }
}

