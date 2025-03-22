import java.util.*;
class level1pp15 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int unitprice  = i.nextInt();
		int quantity = i.nextInt();
		System.out.println("The total purchase price is INR "+ (unitprice * quantity) +" if the quantity is "+quantity+" and unit price is INR "+unitprice);

	}
}