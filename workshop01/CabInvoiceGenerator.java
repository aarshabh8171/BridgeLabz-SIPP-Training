package workshop01;

import java.util.*;

public class CabInvoiceGenerator {

    // Ride class to store distance, time and type of ride
    static class Ride {
        double distance;
        int time;
        String rideType;

        Ride(double distance, int time, String rideType) {
            this.distance = distance;
            this.time = time;
            this.rideType = rideType;
        }
    }

    // Class to summarize invoice details
    static class InvoiceSummary {
        int totalRides;
        double totalFare;
        double averageFare;

        InvoiceSummary(int totalRides, double totalFare) {
            this.totalRides = totalRides;
            this.totalFare = totalFare;
            this.averageFare = totalFare / totalRides;
        }

        public void printSummary() {
            System.out.println("Total Rides: " + totalRides);
            System.out.println("Total Fare: ₹" + totalFare);
            System.out.printf("Average Fare: ₹%.2f\n", averageFare);
        }
    }

    // FareCalculator to calculate fare based on ride type
    static class FareCalculator {
        public static double calculateFare(Ride ride) {
            double costPerKm = 0;
            double costPerMin = 0;
            double minFare = 0;

            // Set values according to ride type
            if (ride.rideType.equalsIgnoreCase("NORMAL")) {
                costPerKm = 10;
                costPerMin = 1;
                minFare = 5;
            } else if (ride.rideType.equalsIgnoreCase("PREMIUM")) {
                costPerKm = 15;
                costPerMin = 2;
                minFare = 20;
            } else {
                System.out.println("Invalid ride type: " + ride.rideType);
                return 0;
            }

            double fare = ride.distance * costPerKm + ride.time * costPerMin;

            // Return max of calculated fare or minimum fare
            return Math.max(fare, minFare);
        }
    }

    // To store all rides for each user
    static class RideRepository {
        Map<String, List<Ride>> userRides = new HashMap<>();

        void addRides(String userId, List<Ride> rides) {
            userRides.put(userId, rides);
        }

        Ride[] getRides(String userId) {
            List<Ride> rides = userRides.get(userId);
            if (rides != null) {
                return rides.toArray(new Ride[0]);
            }
            return new Ride[0]; // return empty array if no rides found
        }
    }

    // Service class to generate invoice
    static class InvoiceService {
        RideRepository rideRepo;

        InvoiceService(RideRepository repo) {
            this.rideRepo = repo;
        }

        InvoiceSummary generateInvoice(Ride[] rides) {
            double totalFare = 0;
            for (Ride ride : rides) {
                totalFare += FareCalculator.calculateFare(ride);
            }
            return new InvoiceSummary(rides.length, totalFare);
        }

        InvoiceSummary generateInvoiceForUser(String userId) {
            Ride[] rides = rideRepo.getRides(userId);
            return generateInvoice(rides);
        }
    }

    // Main method where execution starts
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RideRepository repository = new RideRepository();
        InvoiceService invoiceService = new InvoiceService(repository);

        // Take user input
        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();

        System.out.print("Enter number of rides: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<Ride> rideList = new ArrayList<>();

        // Get each ride details
        for (int i = 1; i <= n; i++) {
            System.out.println("\nRide " + i + " details:");

            System.out.print("Distance (km): ");
            double distance = sc.nextDouble();

            System.out.print("Time (minutes): ");
            int time = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Ride Type (NORMAL / PREMIUM): ");
            String type = sc.nextLine();

            Ride ride = new Ride(distance, time, type);
            rideList.add(ride);
        }

        // Store rides for the user
        repository.addRides(userId, rideList);

        // Generate and display invoice
        InvoiceSummary summary = invoiceService.generateInvoiceForUser(userId);
        System.out.println("\n===== INVOICE =====");
        summary.printSummary();

        sc.close();
    }
}
