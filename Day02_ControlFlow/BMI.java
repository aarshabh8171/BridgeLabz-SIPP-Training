import java.util.Scanner;

public class BMI{
    public static void main(String[] args) {
	//Input
        Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		double heightCm = sc.nextDouble();

        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
	//Conditions
        String status;
        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        System.out.printf("Your BMI is", bmi);
        System.out.println("Weight Status " + status);
    }
}