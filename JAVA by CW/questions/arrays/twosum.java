package Arrays;
import java.util.Scanner;
public class twosum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int x = in.nextInt();
        for(int i = 0; i < n ; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == x){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }

    }
}
