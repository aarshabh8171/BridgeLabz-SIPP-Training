import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    // Method to generate 10 OTPs and store in an array
    public static int[] generateOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) {
                return false; // duplicate found
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = generateOTPs(10);

        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        boolean unique = areOTPsUnique(otps);
        System.out.println("Are all OTPs unique? " + unique);
    }
}
