package ARRAYS.Searching.BinarySearch.java;
import java.util.Scanner;
public class Order_Agnostic_Binary_Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("enter the target to be search: ");
        int target = input.nextInt();
        System.out.println(orderagnosticBS(arr, target));
    }

    static int orderagnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        //  find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (arr[mid] < target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
