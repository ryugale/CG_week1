import java.util.*;
class Assisted5 {
	public  static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		double radius = c.nextInt();
		double height = c.nextInt();
		double vol = Math.PI * Math.pow(2, radius) * height;
		System.out.println("Volume = " + vol);
	}
}	
	