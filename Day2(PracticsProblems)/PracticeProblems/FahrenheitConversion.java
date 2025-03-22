import java.util.*;
public class FahrenheitConversion  {
	public  static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int celsius = c.nextInt();
		int fahrenheit = (celsius * 9/5) + 32;
		System.out.println("fahrenheit = " + fahrenheit);
	}
}	
	