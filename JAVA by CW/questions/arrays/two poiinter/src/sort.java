import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("original array: "+Arrays.toString(arr));
        System.out.println("sorted array: "+Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
//        for(int i = 0; i < count(arr); i++){
//            arr[i] = 0;
//        }
//        for(int j = count(arr) - 1; j < arr.length; j++ ){
//            arr[j] = 1;
//        }
        int zeroes = count(arr);
        for(int i = 0; i < arr.length; i++){
            if(i < zeroes){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
        return arr;
    }
    static int count(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        return count;
    }
}
