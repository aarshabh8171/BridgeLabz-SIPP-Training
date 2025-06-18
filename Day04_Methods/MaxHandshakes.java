import java.util.Scanner;

public class MaxHandshakes {

    // Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int maxHandshakes = calculateHandshakes(numberOfStudents);

        System.out.println("The maximum number of handshakes possible is: " + maxHandshakes);

        scanner.close();
    }
}
