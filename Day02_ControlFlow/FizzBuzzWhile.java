import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
     //Loop
        int i = 1;
        while (i <= number) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
            i++;
        }
    }
}

