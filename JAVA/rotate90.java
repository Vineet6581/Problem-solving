package Arrays.MultiDiaarray;
import java.util.*;

public class rotate90 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i = 0 ; i < m; i++){
            for(int j = 0; j <=i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
        rev(arr);
        print(arr);
    }
    public static void print(int[][] arr){
        int m = arr.length, n=arr[0].length;
        for(int i = 0; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void rev(int[][] arr){
        for(int i = 0; i < arr.length;i++){
            int l = 0;
            int r = arr[i].length-1;
            while(l<r){
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;
                l++;
                r--;
            }
        }
    }
}

