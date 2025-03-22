import java.util.*;
class factorofNumber{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int number = ip.nextInt();
        int counter = 1;
        if (number>0){
            while(counter<number){
                if( number % counter == 0){
                    System.out.println("factors are "+counter);
                }counter++;
            }
        }
    }
}