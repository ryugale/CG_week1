import java.util.*;
public class DoubleOpt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		double o1 = a + b * c;
		double o2 = a * b + c;
		double o3 = c + a / b;
		double o4 = a % b + c;
		//System.out.println("The output for the integer operations a + b * c, a * b + c, c + a / b, and a % b + c are "+o1+" ,"+o2+" ,"+o3+" and "+o4);
		
		System.out.printf("The output for the integer operations a + b * c, a * b + c, c + a / b, and a %% b + c are %.2f, %.2f, %.2f and %.2f, " ,o1 ,o2 ,o3,o4);
	}
}
