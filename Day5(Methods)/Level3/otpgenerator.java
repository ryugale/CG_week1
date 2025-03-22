import java.util.*;
public class otpgenerator {
    public static void main(String[] args) {
        int[] otpArray = new int[10];
        
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpArray[i]);
        }
        
        System.out.println("Are all OTPs unique? " + areOTPsUnique(otpArray));
    }
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000); }
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        
        for (int otp : otps) {
            if (!uniqueSet.add(otp)) {
                return false; 
            }
        }
        return true; 
    }
}