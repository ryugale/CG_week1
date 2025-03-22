import java.util.*;
class maxhandshakes{
    Scanner sc = new Scanner(System.in);
    
    public int maxNumber(){
        System.out.println("Enter number of students : ");
        int num = sc.nextInt();
        int maxnum = (num*(num-1))/2;
        System.out.println("The maximum number of handshakes between "+ num +" students is "+maxnum);
        return maxnum;
    }
    public static void main(String[] args) {
        maxhandshakes student = new maxhandshakes();
        student.maxNumber();
    }}