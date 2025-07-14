package Day02_Stack_Queue_HashMaps;

import java.util.*;

public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(target - num)) {
                System.out.println("Pair found: " + num + " + " + (target - num));
                return true;
            }
            set.add(num); // Store each number seen
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;
        System.out.println("Exists: " + hasPairWithSum(arr, target));
    }
}
