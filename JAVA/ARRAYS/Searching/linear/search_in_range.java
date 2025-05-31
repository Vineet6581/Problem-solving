package ARRAYS.Searching.linear;
import java.util.Scanner;
public class search_in_range {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("enter the array of 10 elements: ");
        for(int  i=0; i<arr.length; i++)
            arr[i] = input.nextInt();
        System.out.println("enter target to be search: ");
        int target = input.nextInt();
        System.out.println("enter starting index: ");
        int start = input.nextInt();
        System.out.println("enter ending index: ");
        int end = input.nextInt();
        System.out.println("target found at index ="+search(arr,start,end,target));
    }
    static int search(int[] arr, int start, int end,int target){
        if(start < 0 || end > arr.length || start > end)
            return -1;
        for(int i = start; i<end; i++){
            if(target == arr[i])
                return i;
        }
        return -1;
    }
}
