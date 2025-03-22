import java.util.*;
class Self1 {
	public  static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		float principle = c.nextInt();
		float rate = c.nextInt();
		int time = c.nextInt();
		double SI = (principle * rate * time) / 100;
		System.out.println("Simple Interest = " + SI);
	}
}	
	