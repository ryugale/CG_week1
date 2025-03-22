import java.util.*;
class naturalnumber{
    Scanner sc = new Scanner(System.in);
    
    public int calculateSum(){
        int num = sc.nextInt();
        int sum = 0;
        for(int i= 0; i<=num;i++){
            sum= sum+i;
        }
        System.out.println("the Sum is "+sum);
        return sum;
        }


        public static void main(String[] args){
            naturalnumber natural = new naturalnumber();
            natural.calculateSum();
        }
    }