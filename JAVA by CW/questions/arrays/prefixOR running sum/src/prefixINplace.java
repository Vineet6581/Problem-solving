import java.util.Arrays;
import java.util.Scanner;

public class prefixINplace {
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
        for(int i = 1; i < n; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }
}
