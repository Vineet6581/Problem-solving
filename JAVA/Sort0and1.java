package Arrays;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;

public class Sort0and1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = in.nextInt();
        }




        // METHOD -1
        // Arrays.sort(arr);


        //METHOD-2
//        int count = 0;
//        for(int i = 0; i<n; i++){
//            if(arr[i]==0){
//                count++;
//            }
//        }
//        for(int i = 0; i <n; i++){
//            if(i < count){
//                arr[i] = 0;
//            } else if( i >= count){
//                arr[i] = 1;
//            }
//
//        }

        //METHOD-3
//        int n0 = 0;
//        for(int i = 0; i < n; i++){
//            if(arr[i]==0) n0++;
//        }
//        for(int i = 0; i < n0;i++){
//            arr[i] = 0;
//        }
//        for(int i = n0; i < n; i++){
//            arr[i] = 1;
//        }



        //METHOD-4 -> one pass solution
        int i = 0;
        int j = n-1;
        while(i<j){
            if(arr[i] == 0) i++;
            else if(arr[j] == 1) j--;
            else if(arr[i] == 1 && arr[j] ==0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }

        }



        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int l , int r){
        while(l <= r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
