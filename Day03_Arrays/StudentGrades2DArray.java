import java.util.Scanner;
public class StudentGrades2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks: ");
            marks[i][0] = scanner.nextInt();
            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = scanner.nextInt();
            System.out.print("Enter Maths marks: ");
            marks[i][2] = scanner.nextInt();
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;
            if (percentages[i] >= 90) grades[i] = "A";
            else if (percentages[i] >= 75) grades[i] = "B";
            else if (percentages[i] >= 60) grades[i] = "C";
            else grades[i] = "D";
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + ": Percentage = " + percentages[i] + "%, Grade = " + grades[i]);
        }
    }
}