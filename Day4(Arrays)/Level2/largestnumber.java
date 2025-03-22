/*import java.util.*;
class largestnumber{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");
       long number = sc.nextLong();
       int maxDidit = 10, index = 0;
       long maxNum=0,nextMax=0;
       long[] arr = new long[maxDidit];
       while(number!=0){
           if(index==maxDidit)
           {System.out.println("here");
               break;}
           else{
               arr[index] = number % 10;
               number /= 10;
               index++;
           }


       }
       System.out.println(Arrays.toString(arr));


       for(int i=0;i<maxDidit;i++){
           maxNum = maxNum< arr[i]? arr[i] : maxNum;
       }
       for(int i=0;i<maxDidit;i++){
           nextMax = (nextMax< arr[i] && nextMax!=maxNum)?  nextMax:  arr[i];
       }
       System.out.println(maxNum);
       System.out.println(nextMax);
   }  
}*/
import java.util.*;
public class largestnumber{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number: ");
       long number = sc.nextLong();
       int maxDidit = 10, index = 0;
       long maxNum=0,nextMax=0;
       long[] arr = new long[maxDidit];
       while(number!=0){
           if(index==maxDidit){
               maxDidit *= 2;
               long[] tempArray = new long[maxDidit];
               for (int i=0;i<arr.length;i++){
                   tempArray[i] = arr[i];
               }
               arr = tempArray;
           }
          
           else{
               arr[index] = number % 10;
               number /= 10;
               index++;
           }


       }
       System.out.println(Arrays.toString(arr));


       for(int i=0;i<maxDidit;i++){
           maxNum = maxNum< arr[i]? arr[i] : maxNum;
       }
       for(int i=0;i<maxDidit;i++){
           nextMax = (nextMax< arr[i] && nextMax!=maxNum)?  nextMax:  arr[i];
       }
       System.out.println(maxNum);
       System.out.println(nextMax);
   }  
}