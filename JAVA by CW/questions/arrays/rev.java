package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class rev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
//        int l = 0;
//        int r = n-1;
//        for(int i = 0; i < n/2; i++){
//            if(r>0 && l <n){
//                int temp = arr[i];
//                arr[l] = arr[r];
//                arr[r] = temp;
//                l++;
//                r--;
//            }
//        }

//        for(int i = 0; i < n/2 ; i++){
//            int j = n-1-i;
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j]=temp;
//        }


        int i = 0;
        int j = n-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;
            j--;
        }


        System.out.println(Arrays.toString(arr));
    }
}
