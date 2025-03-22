import java.util.*;
class springseason {
    Scanner z = new Scanner(System.in);

    public boolean dateGiven(){
        System.out.print(" Enter Month: ");
		int month = z.nextInt();
		System.out.print(" Enter Day: ");
		int day = z.nextInt();
        boolean isSpring ;
		if (month > 12 || day > 31) {
			System.out.println("invalid");
            isSpring = false;
			}
			else if(month == 3 && day >= 20 && day <= 31) {
            System.out.println("Its a Spring Season");
            isSpring = true;
		} else if (month == 4 && day >= 1 && day <= 30) {
            System.out.println("Its a Spring Season");
            isSpring = true;
        } else if (month == 5 && day >= 1 && day <= 31) {
            System.out.println("Its a Spring Season");
            isSpring = true;
        } else if (month == 6 && day >= 1 && day <= 20) {
			System.out.println("Its a Spring Season");
            isSpring = true;
		} else {
			System.out.println("Not a Spring Season");
            isSpring = false;}
            return isSpring;
	
    }
	public static void main(String[] args) {
        springseason date = new springseason();
        System.out.println(date.dateGiven());
    }}