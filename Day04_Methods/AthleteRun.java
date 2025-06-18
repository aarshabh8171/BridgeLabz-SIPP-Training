import java.util.Scanner;

public class AthleteRun {

    // Method to compute the number of rounds needed to complete 5 km
    public static int computeRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3; // perimeter in meters
        double distance = 5000.0; // 5 km in meters
        int rounds = (int) Math.ceil(distance / perimeter);
        return rounds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangular park in meters:");

        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

        int rounds = computeRounds(side1, side2, side3);

        System.out.println("The athlete must complete " + rounds + " rounds to complete a 5 km run.");

        scanner.close();
    }
}
