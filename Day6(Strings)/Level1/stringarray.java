import java.util.*;
class stringarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] result1 = usingcharAt(str);
        char[] result2 = usingtoCharArray(str);
        System.out.println("the 2 arrays are equal: "+comparearray(result1, result2));

    }
    public static char[] usingcharAt(String str){
        char[] arr1 = new char[str.length()];
        for(int i =0;i<str.length(); i++){
            arr1[i] =str.charAt(i);
        }return arr1;
    }
    public static char[] usingtoCharArray(String str){
        char[] arr2 = new char[str.length()];
        arr2 = str.toCharArray();
        return arr2;
    } 
    public static boolean comparearray(char[] result1, char[] result2){
        if(result1.length!=result2.length){
            return false;
        }
        for (int i =0;i<result1.length;i++){
            if(result1[i]!=result2[i]){
                return false;
            }
        }return true;
    }
}