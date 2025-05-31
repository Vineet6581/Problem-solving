package ARRAYS.Searching.linear;
import java.util.Scanner;
public class Max2Dvalue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("enter the array elements: ");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("max value: ");
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] ints: arr ){
            for(int element : ints){
                if(element > max)
                    max = element;
            }
        }
        return max;
    }
}
