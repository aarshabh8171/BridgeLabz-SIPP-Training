public class NullPointer{

    //  Method to generate the Exception
    public static void generateException() {
        String text = null;  // initialize to null
        // This will throw NullPointerException
        int length = text.length();
        System.out.println("Length: " + length);
    }

    // Method to handle the Exception using try-catch
    public static void handleException() {
        String text = null;
        try {
            int length = text.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        handleException();
    }
}
