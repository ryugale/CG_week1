
import java.util.*;

class abundantnumber {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum > num) {
            System.out.println(num + " Is an Abundant number");
        } else {
            System.out.println("Not abundant number");
        }
    }
}
