package Day02_Stack_Queue_HashMaps;

import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num); // Store all unique elements

        int maxLen = 0;

        for (int num : set) {
            // Start only if num is the beginning of a sequence
            if (!set.contains(num - 1)) {
                int curr = num;
                int length = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    length++;
                }

                maxLen = Math.max(maxLen, length);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Length: " + longestConsecutive(arr));
    }
}
