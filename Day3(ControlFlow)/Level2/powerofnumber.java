
import java.util.Scanner;

class powerofnumber{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int number = ip.nextInt();
        int power = ip.nextInt();
        int result = 1;
        int i = 1;
        if(number>0&&power>0){
            while( i <= power ){
                result = number*result;
                i++;
            }System.out.println("power of number is "+ result);
        }
    }
}