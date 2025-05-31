package ARRAYS.Searching.linear;
import java.util.Scanner;
import java.util.Arrays;
public class search_in_2D_Array {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("enter the 9 elements of the array: ");
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[i].length;j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("enter the target to be search: ");
        int target = input.nextInt();
        System.out.println("target found at {row,column}: ");
        int[] ans = search(arr, target); // format of return value{start,end}
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j}; //{row,column}
                }
                }
        }
        return new int[]{-1,-1};
    }
}
