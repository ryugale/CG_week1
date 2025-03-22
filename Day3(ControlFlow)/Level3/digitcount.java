import java.util.*;
class digitcount {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        int count = 0;
        while (num!=0){
            num = num /10;
            count++;
        }System.out.println("Number of digits is : " +count);
    }
}