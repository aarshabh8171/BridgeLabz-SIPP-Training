import java.util.Scanner;

public class WordLengthFinder {
    // Method to split string manually using charAt()
    public static String[] splitWords(String str) {
        str = str.trim() + " ";
        String word = "";
        int count = 0;
        String[] temp = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                word += str.charAt(i);
            else if (!word.equals("")) {
                temp[count++] = word;
                word = "";
            }
        }
        String[] words = new String[count];
        System.arraycopy(temp, 0, words, 0, count);
        return words;
    }

    // length finder
   public static int getLength(String word) {
    int len = 0;
    while (true) {
        // break if accessing next index is invalid
        if (len >= word.toCharArray().length) {
            break;
        }
        len++;
    }
    return len;
}


    // Create 2D array of words and their lengths
    public static String[][] wordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = inp.nextLine();
        String[] words = splitWords(sentence);
        String[][] result = wordLengthArray(words);

        System.out.println("Word\tLength");
        for (String[] row : result)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}
