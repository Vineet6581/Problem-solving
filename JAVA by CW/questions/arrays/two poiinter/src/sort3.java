import java.util.Arrays;
import java.util.Scanner;

public class sort3 {
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
        System.out.println("sorted array: "+Arrays.toString(sort(arr)));
        System.out.println("sorted array: "+Arrays.toString(sort2(arr)));

    }
    static int[] sort(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i < j){
            if(arr[i]%2 == 0){
                i++;
            }else if(arr[j]%2 != 0){
                j--;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }
    static int[] sort2(int[] arr){
        int n = arr.length;
        int left = 0, right = n - 1;
        while(left < right){
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2 == 0 ){
                left++;
            }
            if(arr[right]%2 == 1){
                right--;
            }
        }
        return arr;
    }
    static int[] swap(int [] arr, int i , int j){
        int n = arr.length;
        if(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
       return arr;
    }
}
