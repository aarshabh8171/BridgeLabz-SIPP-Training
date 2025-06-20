import java.util.Scanner;

public class StringLengthWithoutLength {
    
    // Method to find length using charAt() and exception
    public static int getLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Do nothing: loop ends when charAt throws exception
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = inp.next(); // next() reads single word

        int manualLength = getLength(word); // user-defined method
        int builtinLength = word.length();  // built-in method

        System.out.println("Length using method: " + manualLength);
        System.out.println("Length using built-in: " + builtinLength);
    }
}
