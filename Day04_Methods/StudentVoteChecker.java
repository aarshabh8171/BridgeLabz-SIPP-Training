import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if student can vote based on age
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        System.out.println("Enter the ages of 10 students:");

        for (int i = 0; i < 10; i++) {
            ages[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " (age " + ages[i] + ") can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (age " + ages[i] + ") cannot vote.");
            }
        }

        scanner.close();
    }
}
