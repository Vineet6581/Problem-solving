package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class rotateExtraArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        k = k %n;
        int[] ans = new int[arr.length];
        int a = 0;
        for(int i = n-k ; i < n  ;i++){
            ans[a] =  arr[i];
            a++;
        }
        for(int i = 0 ; i < n-k; i++){
            ans[a]=arr[i];
            a++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
