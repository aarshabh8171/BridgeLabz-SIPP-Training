package Day02_Stack_Queue_HashMaps;

import java.util.*;

public class CircularTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of petrol pumps: ");
        int n = sc.nextInt();

        int[] petrol = new int[n];
        int[] distance = new int[n];

        System.out.println("Enter petrol and distance for each pump:");
        for (int i = 0; i < n; i++) {
            petrol[i] = sc.nextInt();
            distance[i] = sc.nextInt();
        }

        int start = findStartingPoint(petrol, distance, n);

        if (start == -1) {
            System.out.println("No feasible starting point found.");
        } else {
            System.out.println("Start at petrol pump index: " + start);
        }
    }

    static int findStartingPoint(int[] petrol, int[] distance, int n) {
        int start = 0;
        int end = 1;

        int curr_petrol = petrol[start] - distance[start];

        while (start != end || curr_petrol < 0) {
            while (curr_petrol < 0 && start != end) {
                curr_petrol -= petrol[start] - distance[start];
                start = (start + 1) % n;

                if (start == 0)
                    return -1;
            }

            curr_petrol += petrol[end] - distance[end];
            end = (end + 1) % n;
        }

        return start;
    }
}

