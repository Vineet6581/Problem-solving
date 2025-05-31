import java.util.Arrays;
import java.util.Scanner;

public class subArray {
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
        System.out.println("Equal Partition Possible: "+(equalSumPartition(arr)));
    }
    static int findarraysum(int[] arr){
        int totalsum = 0;
        for(int i = 0; i < arr.length; i++){
            totalsum += arr[i];
        }
        return totalsum;
    }
    static boolean equalSumPartition(int[] arr){
        int totalsum = findarraysum(arr);
        int prefsum = 0;
        for(int i = 0; i < arr.length; i++){
            prefsum += arr[i];
            int suffixsum = totalsum - prefsum;
            if(suffixsum == prefsum){
                return true;
            }
        }
        return false;
    }
}

