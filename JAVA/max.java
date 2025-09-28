package Arrays.MultiDiaarray;
import java.util.*;
public class max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = {{1,52,53},{34,54,23},{98,23,43}};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <arr.length; i++){
            for(int j = 0; j < arr[i].length;j++){
                max = Math.max(arr[i][j],max);
            }
        }
        System.out.println(max);
    }
}
