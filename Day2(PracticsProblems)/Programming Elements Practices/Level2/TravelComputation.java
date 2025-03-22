import java.util.*;
public class TravelComputation {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		String name = z.next();
		String fromCity = z.next();
		String viaCity = z.next();
		String toCity = z.next();
		double distanceFromToVia = z.nextDouble();
		int timeFromToVia = z.nextInt();
		double distanceViaToFinalCity = z.nextDouble();
		int timeViaToFinalCity = z.nextInt();
		double totalDistance = distanceFromToVia + distanceViaToFinalCity;
		int totalTime = timeFromToVia + timeViaToFinalCity;
		System.out.println("The Total Distance travelled by " + name + " from " +  fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " km and " +"the Total Time taken is " + totalTime + " minutes");
	}	
}
