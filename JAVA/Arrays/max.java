package Arrays;
import java.util.*;
public class max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = Integer.MIN_VALUE;
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0 ; i < arr.length; i++) {
            if(x<arr[i]){
                x = arr[i];
            }
        }
        System.out.println(x);
    }
}
