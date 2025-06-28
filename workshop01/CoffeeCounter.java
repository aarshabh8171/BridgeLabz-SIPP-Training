package workshop01;

import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coffeeType;
        int quantity;
        double price = 0, total, gst, finalBill;

        while (true) {
            System.out.print("Enter coffee type (Espresso, Latte, Cappuccino) or 'exit' to quit: ");
            coffeeType = sc.nextLine().toLowerCase();

            if (coffeeType.equals("exit")) break;

            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (coffeeType) {
                case "espresso":
                    price = 100;
                    break;
                case "latte":
                    price = 120;
                    break;
                case "cappuccino":
                    price = 150;
                    break;
                default:
                    System.out.println("Invalid coffee type.");
                    continue;
            }

            total = price * quantity;
            gst = total * 0.18; // 18% GST
            finalBill = total + gst;

            System.out.println("Base Amount: ₹" + total);
            System.out.println("GST (18%): ₹" + gst);
            System.out.println("Total Bill: ₹" + finalBill);
        }

        System.out.println("Thank you for visiting!");
    }
}




