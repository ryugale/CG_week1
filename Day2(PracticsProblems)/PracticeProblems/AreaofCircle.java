import java.util.*;
public class AreaofCircle {
	public  static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		double radius = c.nextInt();
		double area = Math.PI * radius * radius;
		System.out.println("Area = " + area);
	}
}	
	