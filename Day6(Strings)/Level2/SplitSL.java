import java.util.ArrayList;
import java.util.Scanner;
public class SplitSL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text=sc.nextLine();
        ArrayList<Integer> a=new ArrayList<Integer>();
        String character="";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch!=' '){
                character=character+ch;
            }
            else{
                {
                System.out.println(character);
                a.add(character.length());
                character="";
                }
            }
        }
        if(!character.isEmpty()){
            System.out.println(character);
            a.add(character.length());
        }
        System.out.println(a);
        int max=a.get(0);
        for(int element:a){
            if(max<element){
                max=element;
            }
           
        }
        System.out.println(max);
        int min=a.get(0);
       
        for(int element:a){
           
            if(min>element){
                min=element;
            }
        }
        System.out.println(min);
    }   
}