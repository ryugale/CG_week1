import java.util.*;
class level2pp10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numberOfchocolates = s.nextInt();
		int numberOfchildren = s.nextInt();
		int each = numberOfchocolates / numberOfchildren;
		int remaining = numberOfchocolates % numberOfchildren;
		System.out.println("The number of chocolates each child gets is "+ each +" and the number of remaining chocolates are "+ remaining);
	}
}
