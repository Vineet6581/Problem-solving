package Arrays;
import java.util.*;
public class secMAX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
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
        for(int i = 0 ; i < arr.length; i++) {
            if(max<arr[i] && arr[i] != x){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
