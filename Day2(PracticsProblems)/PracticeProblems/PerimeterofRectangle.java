import java.util.*;
public class PerimeterofRectangle {
	public static void main(String[] args){
		Scanner c = new Scanner(System.in);
		int length = c.nextInt();
		int height = c.nextInt();
		int peri = 2 * (length + height);
		System.out.println("Perimeter of Rectangle = " + peri);
	}
}
		