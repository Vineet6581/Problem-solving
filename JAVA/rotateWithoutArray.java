package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class rotateWithoutArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        k = k %n;
        rev(arr,0,n-1);
        rev(arr,0,k-1);
        rev(arr,k,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void rev(int[] arr, int l, int r){
        while(l<=r)
        {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        l++;
        r--;
        }
    }
}
