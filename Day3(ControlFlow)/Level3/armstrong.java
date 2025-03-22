import java.util.*;
class armstrong {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        int base;
        int sum = 0;
        int originalnumber = num;
        int digitcount = String.valueOf(num).length();
        while(num!=0){
            base=num%10;
            sum = sum+ (int)Math.pow(base,digitcount);
            num = num/10;
        }
        if(sum == originalnumber){
            System.out.println(originalnumber+" is an armstrong number");
    }
}
}