import java.util.Arrays;
import java.util.Scanner;
public class unique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements of the array: ");
        for(int i =0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        int item = found(arr);
        System.out.println("unique elements: "+item);
    }
    static int found(int[] arr){
        for(int i = 0; i < arr.length ; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i =  0; i < arr.length; i++){
            if(arr[i]>0)
                ans = arr[i];
        }
        return ans;
    }
}
