import java.util.*;
class bmi {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double weightkg = ip.nextDouble();
        double heightcm = ip.nextDouble();
        double bmi = weightkg/((heightcm/100)*(heightcm/100));
        if(bmi<=18.4){
            System.out.println("Underweight");
        }
        else if(bmi<=24.9){
            System.out.println("Normal");
        }
        else if(bmi<=39.9){
            System.out.println("Overweight");
        }
        else if(bmi>=40){
            System.out.println("Obese");
        }
    }
}