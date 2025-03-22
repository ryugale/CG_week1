import java.util.*;
class greatestfactor{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int number = ip.nextInt();
        int greatest = 1;
        int counter = 1;
        if (number>0){
            while(counter<number){
                if( number % counter == 0){
                    greatest = (greatest < counter) ? counter : greatest;
                }counter++;
            }System.out.println("Greatest factor is "+greatest);
        }
    }
}
