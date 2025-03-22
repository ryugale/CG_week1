
import java.util.*;

class youngestandtallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter age of Friend " + (i + 1) + ": ");
            age[i] = sc.nextInt();
        }

        for (int i = 0; i < height.length; i++) {
            System.out.println("Enter height of student " + (i + 1) + ": ");
            height[i] = sc.nextInt();
        }

        switch (youngest(age)) {
            case 0:
                System.out.println("Amar is youngest");
                break;
            case 1:
                System.out.println("Akbar is youngest");
                break;
            case 2:
                System.out.println("Anthony is youngest");
                break;
        }

        switch (tallest(height)) {
            case 0:
                System.out.println("Amar is tallest");
                break;
            case 1:
                System.out.println("Akbar is tallest");
                break;
            case 2:
                System.out.println("Anthony is tallest");
                break;
        }

    }
    public static int youngest(int[] age) {
        int min = 0;
        for (int i = 0; i < age.length; i++) {
            min = age[min] < age[i] ? min : i;
        }
        return min;
    }
    public static int tallest(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            max = height[max] < height[i] ? i : max;
        }
        return max;
    }
}