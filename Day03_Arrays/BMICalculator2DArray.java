import java.util.Scanner;
public class BMICalculator2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
            double weight = scanner.nextDouble();
            System.out.print("Enter height (m) for person " + (i+1) + ": ");
            double height = scanner.nextDouble();
            double bmi = weight / (height * height);
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;
            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 25) weightStatus[i] = "Normal";
            else if (bmi < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i+1) + ": Height = " + personData[i][0] + " m, Weight = " + personData[i][1] + " kg, BMI = " + personData[i][2] + ", Status = " + weightStatus[i]);
        }
    }
}