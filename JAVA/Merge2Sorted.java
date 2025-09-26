package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Merge2Sorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }
        int[] arr = new int[m + n];
        int a1 = 0;
        int a2 = 0;
        int i = 0;
        while (a1 < n && a2 < m) {
            if (arr1[a1] > arr2[a2]) {
                arr[i++] = arr2[a2];
                a2++;
            } else{
                arr[i++] = arr1[a1];
                a1++;
            }
//            else {
//                arr[i++] = arr1[a1];
//                a1++;
//                a2++;
//            }
        }
        while( a1 < n){
            arr[i++] = arr1[a1++];
        }
        while(a2<m){
            arr[i++] = arr2[a2++];
        }
        System.out.println(Arrays.toString(arr));
    }
}
