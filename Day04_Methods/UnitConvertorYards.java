public class UnitConvertorYards {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println("5 yards to feet: " + convertYardsToFeet(5));
        System.out.println("12 feet to yards: " + convertFeetToYards(12));
        System.out.println("2 meters to inches: " + convertMetersToInches(2));
        System.out.println("20 inches to meters: " + convertInchesToMeters(20));
        System.out.println("10 inches to centimeters: " + convertInchesToCentimeters(10));
    }
}