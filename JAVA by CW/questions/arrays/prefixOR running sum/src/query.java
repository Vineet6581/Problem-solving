import java.util.Arrays;
import java.util.Scanner;

public class query {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = input.nextInt();
        int[] arr = new int[n + 1];  // n+1 because starting input from index 1

        System.out.println("Enter the elements of the array:");
        for (int i = 1; i <= n; i++) {  // loop from 1 to n
            arr[i] = input.nextInt();
        }

        prefix(arr, n);

        System.out.println("Enter the number of queries: ");
        int q = input.nextInt();
        while (q-- > 0) {
            System.out.println("Enter the range: ");
            int l = input.nextInt();
            int r = input.nextInt();
            int ans = arr[r] - arr[l - 1];
            System.out.println("Sum: " + ans);
        }
    }

    static void prefix(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            arr[i] += arr[i - 1];
        }
    }
}
