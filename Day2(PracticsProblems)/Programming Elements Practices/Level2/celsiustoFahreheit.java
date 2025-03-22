import java.util.*;
public class celsiustoFahreheit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int celsius = s.nextInt();
		int fahrenheit = ((celsius *9)/5) + 32;
		System.out.printf("The "+celsius+" celsius is "+fahrenheit+" fahrenheit ");
	}
}
