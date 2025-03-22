import java.util.*;
class createsubstring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String result1 = usingcharAt(str, start, end);
        String result2 = usingsubstring(str, start, end);
        System.out.println("Both substrings are equal: "+compareString(result1, result2));
        }
    
    public static String usingcharAt(String str, int start, int end){
        String substr1 = "";
        for (int i = start; i<end; i++){
            substr1 =substr1 + str.charAt(i);
        }return substr1;
    }
    public static String usingsubstring(String str, int start, int end){
        String substr2 = "";
        for(int i =start; i<end;i++){
            substr2 = str.substring(start, end);
        }return substr2;
    }
    public static boolean compareString(String result1, String result2){
    return result1.equals(result2);
    }
}