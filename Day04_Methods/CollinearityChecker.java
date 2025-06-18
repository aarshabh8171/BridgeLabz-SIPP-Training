import java.util.Scanner;

public class CollinearityChecker {

    // Method to check collinearity using slope formula
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // To avoid division by zero, use cross multiplication
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method to check collinearity using area of triangle formula
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates of three points:");

        System.out.print("x1: ");
        int x1 = scanner.nextInt();
        System.out.print("y1: ");
        int y1 = scanner.nextInt();

        System.out.print("x2: ");
        int x2 = scanner.nextInt();
        System.out.print("y2: ");
        int y2 = scanner.nextInt();

        System.out.print("x3: ");
        int x3 = scanner.nextInt();
        System.out.print("y3: ");
        int y3 = scanner.nextInt();

        boolean collinearSlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Using slope formula, points are collinear: " + collinearSlope);
        System.out.println("Using area formula, points are collinear: " + collinearArea);

        scanner.close();
    }
}
