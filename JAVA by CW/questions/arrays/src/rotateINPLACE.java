import java.util.Arrays;
import java.util.Scanner;

public class rotateINPLACE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the number of rotations:");
        int rotation = input.nextInt();
        System.out.println(Arrays.toString(rotate(arr,rotation)));
    }
    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k %n;
        rev(arr,n-k,n-1);
        rev(arr,0,n-k-1);
        rev(arr,0,n-1);
        return arr;

    }
    static int[] rev(int[]arr, int start, int end){
        while(start <= end){
            int temp  = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
