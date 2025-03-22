import java.util.*;
class level2pp2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int o1 = a + b * c;
		int o2 = a * b + c;
		int o3 = c + a / b;
		int o4 = a % b + c;
		System.out.println("The output for the integer operations a + b * c, a * b + c, c + a / b, and a % b + c are "+o1+" ,"+o2+" ,"+o3+" and "+o4);
	}
}
