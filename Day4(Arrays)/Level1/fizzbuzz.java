
import java.util.Scanner;

class fizzbuzz{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num];

        for(int i = 1;i<=num;i++){
            if(i%3==0 && i%5==0){
                arr[i-1]="FizzBuzz";
            }
            else if(i%3==0){
                arr[i-1]="Fizz";
            }
            else if(i%5==0){
                arr[i-1]="Buzz";
            }
            else{
                arr[i-1]=String.valueOf(i);
              
            }
            System.out.println(arr[i-1]);

        }
    }
}