import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent of an angle in degrees
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrigonometricFunctions tf = new TrigonometricFunctions();

        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        double[] results = tf.calculateTrigonometricFunctions(angle);

        System.out.printf("Sine(%.2f) = %.4f%n", angle, results[0]);
        System.out.printf("Cosine(%.2f) = %.4f%n", angle, results[1]);
        System.out.printf("Tangent(%.2f) = %.4f%n", angle, results[2]);

        scanner.close();
    }
}
