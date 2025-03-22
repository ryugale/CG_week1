import java.util.*;
class array2d {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int row = sc.nextInt();
        System.out.println("Enter column number: ");
        int col = sc.nextInt();
        int[][] arr1 = new int[row][col];
        int[] arr2 = new int[row*col];
        int index = 0;
        for(int i = 0; i<row; i++){
            for(int j = 0;j<col;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                arr2[index]=arr1[i][j];
                System.out.print(arr2[index]);
                index++;
            }
        }
    }
}