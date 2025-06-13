package Day01_ProgrammingElement;

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cm;
        System.out.print("Enter your height in cm: ");
        cm = input.nextDouble();

        double inches = cm / 2.54;
        double feet = inches / 12;

        System.out.println("Your Height in cm is " + cm + 
                           " while in feet is " + (int)feet + 
                           " and inches is " + (inches % 12));
        input.close();
    }
}
