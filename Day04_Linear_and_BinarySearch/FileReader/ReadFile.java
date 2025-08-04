// Problem: Read a File Line by Line Using FileReader
package Day04_Linear_and_BinarySearch.FileReader;
import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found or error reading file.");
        }
    }
}