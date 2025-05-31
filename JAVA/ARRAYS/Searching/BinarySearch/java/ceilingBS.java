package ARRAYS.Searching.BinarySearch.java;
import java.util.Scanner;
public class ceilingBS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("enter the 10 array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("enter the target(ceiling value): ");
        int target = input.nextInt();
        System.out.println(ceilingBS(arr,target));
    }
    static int ceilingBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
//        int ceiling = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid +1;
            }
            else if(arr[mid] > target){
//                ceiling = arr[mid];
                end = mid -1;
            }
        }
        // return ceiling;
        return arr[start];
    }
}
