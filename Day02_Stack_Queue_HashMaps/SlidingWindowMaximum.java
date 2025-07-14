package Day02_Stack_Queue_HashMaps;


import java.util.*;

public class SlidingWindowMaximum {

    public static List<Integer> getMaxInSlidingWindow(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            // Remove elements outside the window
            while (!deque.isEmpty() && deque.peek() <= i - k) {
                deque.poll();
            }

            // Remove smaller elements from back
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offer(i);

            // Add result when window is full
            if (i >= k - 1) {
                result.add(arr[deque.peek()]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter window size k: ");
        int k = scanner.nextInt();

        if (k <= 0 || k > n) {
            System.out.println("Invalid window size.");
        } else {
            List<Integer> result = getMaxInSlidingWindow(arr, k);
            System.out.println("\nMaximum in each sliding window:");
            for (int max : result) {
                System.out.print(max + " ");
            }
        }

        scanner.close();
    }
}

