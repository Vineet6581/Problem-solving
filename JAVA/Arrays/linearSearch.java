package Arrays;
import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        boolean flag = false;
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("element found");
        }else{
            System.out.println("element not found");
        }
    }
}
