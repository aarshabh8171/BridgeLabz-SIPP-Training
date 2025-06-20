import java.util.Scanner;

public class StudentGrades {

    // Method 1: Generate 2D array of PCM scores
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 41 + 60); // range: 60–100
            }
        }
        return scores;
    }

    // Method 2: Calculate total, average, percentage 
    public static double[][] calculateStats(int[][] scores) {
        int students = scores.length;
        double[][] stats = new double[students][3]; // [total, average, percentage]

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return stats;
    }

    // Method 3: Grade assignment 
    public static String[] assignGrades(double[][] stats) {
        int students = stats.length;
        String[] grades = new String[students];

        for (int i = 0; i < students; i++) {
            double percentage = stats[i][2];
            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }

        return grades;
    }

    // Method 4: Display scorecard
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("No.\tPhysics\tChemistry\tMath\tTotal\tAverage\t\t%age\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    (int) stats[i][0] + "\t" +
                    stats[i][1] + "\t\t" +
                    stats[i][2] + "\t" +
                    grades[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = inp.nextInt();

        int[][] pcmScores = generateScores(n);
        double[][] stats = calculateStats(pcmScores);
        String[] grades = assignGrades(stats);

        displayScorecard(pcmScores, stats, grades);
    }
}
