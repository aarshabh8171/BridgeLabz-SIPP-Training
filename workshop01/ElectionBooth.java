package workshop01;

import java.util.Scanner;

public class ElectionBooth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] votes = new int[4]; // index 1,2,3 used

        while (true) {
            System.out.print("Enter age of voter or -1 to end: ");
            int age = sc.nextInt();

            if (age == -1) break;

            if (age >= 18) {
                System.out.println("Eligible to vote.");
                System.out.print("Vote for candidate (1, 2, or 3): ");
                int vote = sc.nextInt();

                if (vote >= 1 && vote <= 3) {
                    votes[vote]++;
                    System.out.println("Vote recorded.\n");
                } else {
                    System.out.println("Invalid candidate number.\n");
                }
            } else {
                System.out.println("Not eligible to vote.\n");
            }
        }

        System.out.println("Voting complete. Results:");
        System.out.println("Candidate 1: " + votes[1] + " votes");
        System.out.println("Candidate 2: " + votes[2] + " votes");
        System.out.println("Candidate 3: " + votes[3] + " votes");
    }
}
