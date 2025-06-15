import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //Condition
        System.out.println("Is the first number the smallest? " + (a < b && a < c));
    }
}

