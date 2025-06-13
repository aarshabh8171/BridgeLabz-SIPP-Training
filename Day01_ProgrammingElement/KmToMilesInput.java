package Day01_ProgrammingElement;

import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km;
        System.out.print("Enter distance in km: ");
        km = input.nextDouble();
        double miles = km * 0.621371;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
    }
}
