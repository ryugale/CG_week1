import java.util.*;
class harshadnumber {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        int original = num;
        int sum = 0;
        while(num>0){
            sum = sum + num%10;
            num = num/10;
        }
        if (original % sum == 0){
            System.out.println(original +" Is an harshad number");
        } else {
            System.out.println("Not an harshad number");
        }
    }
}