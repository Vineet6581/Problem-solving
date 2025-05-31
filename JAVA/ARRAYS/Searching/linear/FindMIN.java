package ARRAYS.Searching.linear;
import java.util.Scanner;
public class FindMIN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the 5 elements of array");
        for(int i = 0; i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(ans >arr[i])
                ans = arr[i];
        }
        return ans;
    }
}
