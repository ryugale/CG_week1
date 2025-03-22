import java.util.*;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int principal = s.nextInt();
		int rate = s.nextInt();
		int time = s.nextInt();
		int si = principal * rate * time / 100;
		System.out.println("The Simple Interest is "+ si +" for Principal "+ principal +", Rate of Interest "+ rate +" and Time "+time);
	}
}
