import java.util.*;
public class DistanceinYards {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		double feet  = i.nextInt();
		double yard = feet/3;
		double miles = yard / 1760;
		System.out.println("The distance in feet is "+feet+" and in yards is "+yard+" and in miles is "+miles);

	}
}