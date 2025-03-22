import java.util.*;
class ageandheight {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int amarage = ip.nextInt();
        int akbarage = ip.nextInt();
        int anthonyage = ip.nextInt();
        int amarheight = ip.nextInt();
        int akbarheight = ip.nextInt();
        int anthonyheight = ip.nextInt();
        
        if (amarage<akbarage&&amarage<anthonyage){
            System.out.println("Amar is Youngest");
        }
        else if(akbarage<amarage&&akbarage<anthonyage){
            System.out.println("Akbar is Youngest");
        }
        else{
            System.out.println("Anthony is Youngest");
        }

        if(amarheight>akbarheight&&amarheight>anthonyheight){
            System.out.println("Amar s Tallest");
        }
        else if(akbarheight>amarheight&&akbarheight>anthonyheight){
            System.out.println("Akbar is Tallest");
        }
        else{
            System.out.println("Anthony is Tallest");
        }
    }
}
