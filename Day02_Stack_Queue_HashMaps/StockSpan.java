package Day02_Stack_Queue_HashMaps;


import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static int[] calculateSpan(int[] prices, int n) {
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>(); // Stack stores indices

        for (int i = 0; i < n; i++) {
            // Pop elements from stack while the current price is greater or equal
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, price is highest so far
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());

            stack.push(i); // Push this day's index onto the stack
        }
        return span;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = scanner.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter stock prices for " + n + " days:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int[] span = calculateSpan(prices, n);

        System.out.println("\nStock Spans:");
        for (int i = 0; i < n; i++) {
            System.out.println("Day " + (i + 1) + " (Price: " + prices[i] + ") → Span: " + span[i]);
        }

        scanner.close();
    }
}

