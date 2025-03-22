import java.util.*;
class checknumber {
    Scanner sc = new Scanner(System.in);

    public int giveNumber(){
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num>0){
            return 1;
        }
        else if (num<0){
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        checknumber number = new checknumber();
        System.out.println(number.giveNumber());
    }
}