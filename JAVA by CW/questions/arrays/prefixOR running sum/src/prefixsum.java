import java.util.Arrays;
import java.util.Scanner;

public class prefixsum {
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
        System.out.println("after running sum array: "+Arrays.toString(prefix(arr)));
    }
    static int[] prefix(int[] arr){

        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        for(int i = 1; i < n ; i++){
            ans[i] = ans[i-1]+arr[i];
        }
        return ans;
    }
}