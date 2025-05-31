package ARRAYS.Searching.BinarySearch.java;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("enter the array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("enter the target to be search: ");
        int target = input.nextInt();
        System.out.println("the value is found at index: ");
        System.out.println(binarysearch(arr , target));
    }
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(arr.length>0  && start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target)
                end = mid - 1;
            else if(arr[mid] < target)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
