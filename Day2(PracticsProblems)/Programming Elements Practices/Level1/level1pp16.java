import java.util.*;
class level1pp16 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int n = i.nextInt();
		int handshakes = (n*(n - 1))/2;
		System.out.println("Number of possible handshakes is "+handshakes);

	}
}