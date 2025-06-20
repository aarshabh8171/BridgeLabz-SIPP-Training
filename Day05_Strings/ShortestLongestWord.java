import java.util.Scanner;

public class ShortestLongestWord {
    public static String[] splitWords(String str) {
        str = str.trim() + " ";
        String word = "";
        String[] temp = new String[str.length()];
        int count = 0;
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

    public static int getLength(String word) {
    int len = 0;
    while (true) {
        // break if next index is invalid
        if (len >= word.toCharArray().length) {
            break;
        }
        len++;
    }
    return len;
    }

    public static int[] findMinMax(String[] words) {
        int min = getLength(words[0]), max = min;
        for (String w : words) {
            int l = getLength(w);
            if (l < min) min = l;
            if (l > max) max = l;
        }
        return new int[] {min, max};
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = inp.nextLine();
        String[] words = splitWords(sentence);
        int[] minMax = findMinMax(words);
        System.out.println("Shortest word length: " + minMax[0]);
        System.out.println("Longest word length: " + minMax[1]);
    }
}
