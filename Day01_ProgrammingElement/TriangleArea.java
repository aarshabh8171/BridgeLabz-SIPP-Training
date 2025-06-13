package Day01_ProgrammingElement;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height;

        System.out.print("Enter base: ");
        base = input.nextDouble();

        System.out.print("Enter height: ");
        height = input.nextDouble();

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516; // 1 inch² = 6.4516 cm²

        System.out.println("Area in square inches: " + areaInInches);
        System.out.println("Area in square centimeters: " + areaInCm);

        input.close();
    }
}
