package Arrays;
import java.util.*;
public class DutchFlagAlgo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = in.nextInt();
        }

//        METHOD 1 --> two pass approach
//        int NOZ = 0;
//        int NOO = 0;
//        for(int i = 0; i< n ; i++){
//            if(arr[i] == 0){
//                NOZ++;
//            } else if(arr[i] == 1){
//                NOO++;
//            }
//        }
//        for(int i = 0; i < n ; i++){
//            if(i < NOZ){
//                arr[i] = 0;
//            } else if(i<NOO+NOZ){
//                arr[i] = 1;
//            } else{
//                arr[i] = 2;
//            }
//        }


        // METHOD-2 --> one pass approach --> three pointer approach
        // DUTCH FLAG ALGORITHM
        int low =  0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            } else if(arr[mid] == 1){
                mid++;
            } else if(arr[mid] == 2){
                swap(arr,mid,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int l , int r){
        while(l<=r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r]= temp;
            l++;
            r--;
        }
    }
}
