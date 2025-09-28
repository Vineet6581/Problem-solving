package Arrays.MultiDiaarray;

import java.util.Scanner;

public class StoreMarksRoll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int std = in.nextInt();
        int[][] arr = new int[std][2];
        for(int i = 0; i < std;i++){
            for(int  j = 0; j < 2;j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < std;i++){
            for(int  j = 0; j < 2;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
