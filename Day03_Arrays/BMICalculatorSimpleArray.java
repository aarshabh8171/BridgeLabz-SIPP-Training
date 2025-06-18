import java.util.Scanner;
public class BMICalculatorSimpleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();
        double[] height = new double[number];
        double[] weight = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            height[i] = scanner.nextDouble();
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weight[i] = scanner.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 25) status[i] = "Normal";
            else if (bmi[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i+1) + ": Height = " + height[i] + ", Weight = " + weight[i] + ", BMI = " + bmi[i] + ", Status = " + status[i]);
        }
    }
}