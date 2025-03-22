
import java.util.*;

class simpleinterest {

    Scanner sc = new Scanner(System.in);
    int principal = sc.nextInt();
    int rate = sc.nextInt();
    int time = sc.nextInt();

    public int calculateSimpleinterest() {
        int simpleinterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is " + simpleinterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
        return simpleinterest;
    }

    public static void main(String[] args) {
        simpleinterest obj = new simpleinterest();
        obj.calculateSimpleinterest();
    }

}
