package ARRAYS;
import java.util.Scanner;
import java.util.Arrays;
public class input_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    /*
        1 2 3
        4 5 6
        7 8 9
    */
        int[][] arr = new int[3][3];
        //adding the size of the rows is mandatory
        //while adding the size of the column is not mandatory
    //storing directly
        int[][] arr2D = {
                {1,2,3}, //0th index
                {4,5},   // 1st index
                {6,7,8,9} //2nd index
        };
        // input
        int[][] arr1 = new int[3][3];
        // length of the array is the number of rows
        System.out.println(arr1.length);
        // now taking the input as rows and columns
        for( int row = 0; row < arr1.length; row++){
            for( int col = 0;col < arr[row].length;  col++){
                arr1[row][col] = input.nextInt();
            }
        }
        // methode1: Output
        System.out.println("methode 1: ");
        for( int row = 0; row < arr1.length; row++){
            for( int col = 0; col< arr1[row].length; col++){
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("method 2: ");
        // methode2: Output
        for( int row = 0; row < arr1.length; row++){
            System.out.println(Arrays.toString(arr1[row]));
        }
        System.out.println("methode 3: ");
        // methode3: Output (enhanced for loop)
        for(int[] a : arr1){
            System.out.println(Arrays.toString(a));
        }
    }
}
