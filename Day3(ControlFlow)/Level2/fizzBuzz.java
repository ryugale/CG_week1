import java.util.*;
class fizzBuzz {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int i = 1;
        if ( n > 0){
            while (i<=n){
                if ((i % 3 == 0)&&(i % 5 == 0)){
                    System.out.println("FizzBuzz");
                }
                else if(i % 5 == 0){
                    System.out.println("Buzz");
                }
                else if(i % 3 == 0){
                    System.out.println("Fizz");
                }
                else{
                    System.out.println(i);
                }
                i++;
            }

        } else {
            System.out.println("Negatve Number");
        }
    }

}