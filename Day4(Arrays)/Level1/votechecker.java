import java.util.*;
class votechecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];

        for (int i = 0; i < age.length; i++){
            System.out.print("Age of student " +(i+1)+" is : ");
            age[i] = sc.nextInt();
        }

        for(int i = 0; i< age.length; i++){
            if(age[i]<=0){
                System.out.println("invalid age");
            }
            else if(age[i]<18){
                System.out.println("The student "+(i+1)+" cannot vote");
            }
            else{
                System.out.println("The student "+(i+1)+" can vote");
            }
        }
    }
}