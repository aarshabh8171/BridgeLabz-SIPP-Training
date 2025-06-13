package Day01_ProgrammingElement;

import java.util.Scanner;

public class PurchaseTotal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double unitPrice, quantity;

        System.out.print("Enter unit price: ");
        unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = input.nextDouble();

        double total = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + total +
                           " if the quantity is " + quantity +
                           " and unit price is INR " + unitPrice);
        input.close();
    }
}
 {
    
}
