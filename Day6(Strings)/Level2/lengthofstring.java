import java.util.*;
public class lengthofstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        
        System.out.println("the length of string is "+stringlength(text));
        System.out.println("The length of string using function is "+text.length());
    }
    public static int stringlength(String text){
        int count=0;
        try {
            for(int i =0;i!=-1;i++){
                text.charAt(i);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    
}

