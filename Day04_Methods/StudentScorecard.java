import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random 2-digit scores for PCM for all students
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // Physics, Chemistry, Math
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + rand.nextInt(90); // Physics
            scores[i][1] = 10 + rand.nextInt(90); // Chemistry
            scores[i][2] = 10 + rand.nextInt(90); // Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    // Returns a 2D array with columns: total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100.0;
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\n",
                i + 1, scores[i][0], scores[i][1], scores[i][2],
                results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);

        scanner.close();
    }
}
