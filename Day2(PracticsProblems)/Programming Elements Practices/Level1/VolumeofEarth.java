import java.util.*;
public class VolumeofEarth {
	public static void main(String[] args) {
		int radiuskm = 6378;
		float radiusmiles = 1.6f * radiuskm;
		double volkm = (4/3) * Math.PI * radiuskm * radiuskm * radiuskm;
		double volmiles = (4/3) * Math.PI * radiusmiles * radiusmiles * radiusmiles;
		System.out.println("The volume of earth in cubic kilometers is " + volkm + " and cubic miles is " + volmiles );
	}
}