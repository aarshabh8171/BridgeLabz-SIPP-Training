import java.util.Scanner;

public class CompareSplit {
    public static int getLength(String str) {
    int len = 0;
    while (true) {
        // break if accessing next index is invalid
        if (len >= str.toCharArray().length) {
            break;
        }
        len++;
    }
    return len;
    }

    public static String[] customSplit(String str) {
        str = str.trim() + " ";
        String[] temp = new String[getLength(str)];
        String word = "";
        int count = 0;
        for (int i = 0; i < getLength(str); i++) {
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

    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++)
            if (!a1[i].equals(a2[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = inp.nextLine();
        String[] builtIn = text.trim().split(" ");
        String[] manual = customSplit(text);
        boolean same = compareArrays(builtIn, manual);

        System.out.println("Built-in Split: ");
        for (String w : builtIn) System.out.print(w + " ");
        System.out.println("\nCustom Split: ");
        for (String w : manual) System.out.print(w + " ");
        System.out.println("\nMatch: " + same);
    }
}
