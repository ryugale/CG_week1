import java.util.*;
class level2pp12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float weight = s.nextFloat();
		float pounds = 2.2f * weight;
		System.out.printf("The weight of the person in pound is %.2f and in kg is %.2f" ,pounds, weight);
	}
}
