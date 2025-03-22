import java.util.*;
class multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[4];

        for (int i = 5; i<9;i++){
            array[i-5]=num*(i+1);
            System.out.println(num+" * "+(i+1)+ " = "+array[i-5]);
        }
    }
}