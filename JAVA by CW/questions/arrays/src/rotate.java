import java.util.Arrays;
import java.util.Scanner;

public class rotate {
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
    static int[] rotate(int[] arr, int key){
        int n = arr.length;
        key = key % n;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n-key; i<n;i++){
            ans[j++] = arr[i];
        }
        for(int i = 0; i < n-key; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
}
