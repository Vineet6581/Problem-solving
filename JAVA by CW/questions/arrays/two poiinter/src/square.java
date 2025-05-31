import java.util.Arrays;
import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("original array: "+ Arrays.toString(arr));
        System.out.println("sorted array: "+Arrays.toString(square(arr)));
        System.out.println("sorted array: "+Arrays.toString(square2(arr)));
    }
    static int[] square(int[] arr){
        int n = arr.length;
        int i = 0;
        int left = 0;
        int right = arr.length - 1;
        int[] ans = new int[n];
        int k = 0;
        while( left <= right){
            if(Math.abs(arr[left])  > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else{
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        reverse(ans);
        return ans;
    }
    static void reverse(int[] arr){
        int i = 0, j = arr.length - 1;
        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] swap(int[] arr, int i , int j){
        if(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    static int[] square2(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i]*arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
