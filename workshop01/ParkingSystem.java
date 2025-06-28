package workshop01;

import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int capacity = 5;
        int parkedCars = 0;
        int choice;

        while (true) {
            System.out.println("\n1. Park Car\n2. Exit Car\n3. Show Occupancy\n4. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (parkedCars < capacity) {
                        parkedCars++;
                        System.out.println("Car parked. Spots used: " + parkedCars + "/" + capacity);
                    } else {
                        System.out.println("Parking Full!");
                    }
                    break;

                case 2:
                    if (parkedCars > 0) {
                        parkedCars--;
                        System.out.println("Car exited. Spots used: " + parkedCars + "/" + capacity);
                    } else {
                        System.out.println("No cars to exit.");
                    }
                    break;

                case 3:
                    System.out.println("Current occupancy: " + parkedCars + "/" + capacity);
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
