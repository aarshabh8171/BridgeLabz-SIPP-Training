import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
      int b = sc.nextInt();
     int c = sc.nextInt();
    // Conditions
        System.out.println("Is the first number the largest? " + (a > b && a > c));
        System.out.println("Is the second number the largest? " + (b > a && b > c));
        System.out.println("Is the third number the largest? " + (c > a && c > b));
    }
}

