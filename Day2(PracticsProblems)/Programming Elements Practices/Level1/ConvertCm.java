import java.util.*;
public class ConvertCm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float height = input.nextInt();
		float inches = height / 2.54f;
		float foot = inches / 12;
		System.out.println("Your Height in cm is " + height + " while in feet is " + foot + " and inches is " + inches);
	}
}