import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns: ");
        int row = input.nextInt();
        int col = input.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter the elements row by row: ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print("Element at (" + i + "," + j + "): ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("\nORIGINAL ARRAY:");
        toprintArray(arr);
        System.out.println("\nTRANSPOSE OF ARRAY: ");
        int[][] ans = toTranspose(arr,row,col);
        toprintArray(ans);
        System.out.println("\nINplaceTRANSPOSE OF ARRAY: ");
        toINplaceTranspose(arr,row,col);
        toprintArray(arr);
    }

    static void toprintArray(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] toTranspose(int[][] arr,int row, int col){
        int[][] ans = new int[col][row];
        for(int i = 0; i < col; i++){
            for(int j = 0 ; j < row; j++){
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }
    static void toINplaceTranspose(int[][]arr,int row,int col){
        for(int i = 0; i < col ; i++){
            for(int j = i; j < row ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
