import java.util.*;
public class fahrenheittoCelsius {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int fahrenheit = s.nextInt();
		int celsius = ((fahrenheit - 32) * 5)/9;
		System.out.printf("The "+fahrenheit+" fahrenheit is "+celsius+" celsius ");
	}
}
