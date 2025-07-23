package workshop03;

import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take paragraph input from user
        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        // Take word to search
        System.out.println("Enter the word to search:");
        String searchWord = sc.next();

        // Split paragraph into words
        String[] words = paragraph.split("\\s+");

        // Linear search
        boolean found = false;
        int position = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(searchWord)) {
                found = true;
                position = i + 1; // Position (1-based index)
                break;
            }
        }

        // Output result
        if (found) {
            System.out.println("Word found at position: " + position);
        } else {
            System.out.println("Word not found in the paragraph.");
        }

        sc.close();
    }
}
