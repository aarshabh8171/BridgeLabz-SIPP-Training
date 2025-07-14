package Day02_Stack_Queue_HashMaps;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Enqueue operation
    public void enqueue(int x) {
        stack1.push(x);
        System.out.println("Enqueued: " + x);
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        
        if (stack2.isEmpty()) {
            // Transfer all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Queue Using Two Stacks");
        do {
            System.out.println("\n1. Enqueue\n2. Dequeue\n3. Peek\n4. Is Empty?\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = scanner.nextInt();
                    queue.enqueue(val);
                    break;

                case 2:
                    int removed = queue.dequeue();
                    if (removed != -1)
                        System.out.println("Dequeued: " + removed);
                    break;

                case 3:
                    int front = queue.peek();
                    if (front != -1)
                        System.out.println("Front element: " + front);
                    break;

                case 4:
                    System.out.println(queue.isEmpty() ? "Queue is empty." : "Queue is not empty.");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
