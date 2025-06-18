import java.util.Scanner;
public class StudentMarksPercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentages = new double[n];
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks: ");
            physics[i] = scanner.nextInt();
            System.out.print("Enter Chemistry marks: ");
            chemistry[i] = scanner.nextInt();
            System.out.print("Enter Maths marks: ");
            maths[i] = scanner.nextInt();
            double total = physics[i] + chemistry[i] + maths[i];
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