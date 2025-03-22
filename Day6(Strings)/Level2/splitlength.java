import java.util.Scanner;
public class splitlength {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String text=reader.nextLine();
        String character="";
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch!=' '){
                character=character+ch;
            }
            else{
                System.out.println(character);
                System.out.println(character.length());
                character="";
               
            }
       }
        if(!character.isEmpty()){
            System.out.println(character);
            System.out.println(character.length());
        }
    }  
}