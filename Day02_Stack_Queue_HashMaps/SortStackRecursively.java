package Day02_Stack_Queue_HashMaps;

import java.util.Scanner;
import java.util.Stack;

public class SortStackRecursively {

    // Main recursive function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop(); // Step 1: Remove top
            sortStack(stack);      // Step 2: Sort remaining stack
            insertSorted(stack, top); // Step 3: Insert element at correct position
        }
    }

    // Helper function to insert element in sorted order
    public static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element); // Insert at correct position
        } else {
            int top = stack.pop();
            insertSorted(stack, element);
            stack.push(top); // Put back the popped elements
        }
    }

    // Display the stack
    public static void displayStack(Stack<Integer> stack) {
        System.out.println("Sorted Stack (Top to Bottom):");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements to push into stack: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }

        System.out.println("\nOriginal Stack:");
        displayStack(stack);

        sortStack(stack); // Sort the stack using recursion

        System.out.println("\nAfter Sorting:");
        displayStack(stack);

        scanner.close();
    }
}

