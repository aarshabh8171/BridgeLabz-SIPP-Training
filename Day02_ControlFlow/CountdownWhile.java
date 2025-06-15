import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        //Inpur
        Scanner sc = new Scanner(System.in);
         int counter = sc.nextInt();

//     Condition
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Lift Off!");
    }
}

