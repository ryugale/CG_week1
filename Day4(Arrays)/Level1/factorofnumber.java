
import java.util.*;

class factorofnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int number = sc.nextInt();
        int maxFactor = 10;
        int[] factorsArray = new int[maxFactor];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (index >= factorsArray.length) {
                int[] tempArray = new int[maxFactor * 2];
                for (int j = 0; j < factorsArray.length; j++) {
                    tempArray[j] = factorsArray[j];
                }
                factorsArray = tempArray;
            }
            if (number % i == 0) {
                factorsArray[index] = i;
                index++;
            }
        }
        System.out.println("Factors are: ");
        for (int i = 0; i < index; i++) {
            System.out.println(factorsArray[i]);
        }
    }
}
