package ARRAYS.Searching.BinarySearch.java;
import java.util.Scanner;
public class floorBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(floor(arr, target));
    }

    static int floor(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = arr.length -1;
        if(target<arr[0]){
            return -1;
        }
        if(target > arr[arr.length] - 1){
            return -1;
        }
         while(start <= end){
            int mid = start + (end-start)/2;
                if(arr[mid]==target){
                    return mid;
                }
                else if(arr[mid]<target){
                    start = mid + 1;
                }
                else if(arr[mid] > target){
                    end = mid - 1;
                }
        }
        return arr[end];
    }
}
