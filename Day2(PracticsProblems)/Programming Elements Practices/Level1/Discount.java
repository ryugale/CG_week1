import java.util.*;
public class Discount {
	public static void main(String[] args) {
		int fees = 125000;
		int discountpercent = 10;
		int discountamt = (fees / 100) * discountpercent;
		System.out.println("The discount amount is INR " + discountamt + " and final discounted fee is INR " + (fees - discountamt) );
	}
}