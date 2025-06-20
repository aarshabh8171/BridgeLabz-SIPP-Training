import java.util.Scanner;

public class VowelConsonantChecker {
    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') c += 32;
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) >= 0) return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] analyzeCharacters(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkCharType(str.charAt(i));
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] row : arr)
            System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = inp.nextLine();
        String[][] result = analyzeCharacters(input);
        displayTable(result);
    }
}
