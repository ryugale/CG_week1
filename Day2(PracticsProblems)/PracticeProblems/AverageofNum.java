import java.util.*;
public class AverageofNum {
	public static void main(String[] args){
		Scanner z = new Scanner(System.in);
		int a = z.nextInt();
		int b = z.nextInt();
		int c = z.nextInt();
		float avg = ((a +  b + c) / 3f);
		System.out.println("Average = " + avg);
	}
}