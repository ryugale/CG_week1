import java.util.*;
class comparestrings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println("The 2 strings are equal: "+usingcharAt(str1, str2));
        System.out.println("The 2 strings are equal: "+usingEquals(str1, str2));
    }
        public static boolean usingcharAt(String str1, String str2){
            if(str1.length() != str2.length()){
                return false;
            }
            else{
                for(int i = 0;i<str1.length();i++){
                    if(str1.charAt(i)!=str2.charAt(i)){
                        return false;
                    }
                    
                    }
                }return true;
            }
        
        public static boolean usingEquals(String str1, String str2){
            return str1.equals(str2);
        }
    }