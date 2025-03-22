import java.util.*;
class meanheight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] height = new double[11];
        double sum = 0;
        double mean=0;
        for(int i =0;i<height.length;i++){
            System.out.print("give height of player "+(i+1)+" : ");
            height[i] = sc.nextDouble();
        }
        for(int i=0;i<11;i++){
            sum=sum+height[i];
            mean=(mean+sum)/11;
        }
        System.out.printf("The mean height of the team is %.2f",mean);
    }
}