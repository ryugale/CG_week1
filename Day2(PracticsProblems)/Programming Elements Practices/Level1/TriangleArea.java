import java.util.*;
public class TriangleArea {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		float base = i.nextInt();
		float height = i.nextInt();
		float area = 0.5f * base * height;
		System.out.println("The Height of triangle is "+height+" the base is "+base+" and the area is "+area);

	}
}