import java.util.Scanner;

class multiplesofnumber{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = ip.nextInt();
        int i = 100;
        if (number > 0 && number <100){
            while(i>=1){
                if(number%i==0){
                    System.out.println("the multiples are "+i);
                    
                }i--;
            }
        }
    }
}