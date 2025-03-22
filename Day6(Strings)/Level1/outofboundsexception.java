import java.util.*;
public class outofboundsexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        outofboundsexception obj = new outofboundsexception();
        obj.getexception(text);
        obj.catchexception(text); 
    }
    public void getexception(String text){
        for(int i =0; i<=text.length();i++){
            text.charAt(i);
        }
    }
    public void catchexception(String text){
        try {
            for(int i =0; i<=text.length();i++){
                text.charAt(i);
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}