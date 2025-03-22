import java.util.*;
public class StudentDiscount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int fee = input.nextInt();
		int discountpercent = input.nextInt();
		int discountamt = (fee / 100) * discountpercent;
		System.out.println("The discount amount is INR " + discountamt + " and final discounted fee is INR " + (fee - discountamt) );
	}
}