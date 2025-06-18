public class UnitConvertorMiles {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println("10 kilometers to miles: " + convertKmToMiles(10));
        System.out.println("5 miles to kilometers: " + convertMilesToKm(5));
        System.out.println("3 meters to feet: " + convertMetersToFeet(3));
        System.out.println("12 feet to meters: " + convertFeetToMeters(12));
    }
}