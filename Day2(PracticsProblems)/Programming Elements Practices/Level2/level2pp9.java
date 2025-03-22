import java.util.*;
class level2pp9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int side1 = s.nextInt();
		int side2 = s.nextInt();
		int side3 = s.nextInt();
		int peri = side1 + side2 + side3;
		int distance = 5000;
		float rounds = distance / peri;
		System.out.printf("The total number of rounds the athlete will run is "+ rounds +" to complete 5 km");
	}
}
