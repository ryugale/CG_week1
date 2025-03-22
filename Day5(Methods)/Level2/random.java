import java.util.*;
class random {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the array: ");
       int size = sc.nextInt();
       random obj = new random();
       int[] numbers = obj.generate4DigitRandomArray(size);
       System.out.println(Arrays.toString(numbers));
       System.out.println(Arrays.toString(obj.findAverageMinMax(numbers)));
   }
   public int[] generate4DigitRandomArray(int size){
       int[] arr = new int[size];
       for(int i=0; i<arr.length; i++){
           arr[i] = (int)(Math.random() * 10000);
       }
       return arr;
   }
   public double[] findAverageMinMax(int[] numbers){
       int min;
       int max;
       double sum = 0;
       min = Integer.MAX_VALUE;
       max = Integer.MIN_VALUE;

       for (int num : numbers) {
           min = Math.min(min, num);
           max = Math.max(max, num);
           sum += num;
       }

       double average = sum / numbers.length;
       return new double[]{average, min, max};
   }
}