import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
	//Input
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
// 	Condition
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Lift Off!");
    }
}

