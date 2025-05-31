import java.util.Arrays;
import java.util.Scanner;

public class sort2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("original array: "+ Arrays.toString(arr));
        System.out.println("sorted array using 1st method: "+Arrays.toString(sort(arr)));
        System.out.println("sorted array using 2nd method: "+Arrays.toString(sort1(arr)));
        System.out.println("sorted array using 3rd method: "+Arrays.toString(sort2(arr)));
        System.out.println("sorted array using 4th method: "+Arrays.toString(sort3(arr)));

    }
    static int[] sort(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i] == 1 && arr[j] == 0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
        }
        return arr;
    }
    static int[] sort3(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            while(arr[i] == 0 && i < j){
                i++;
            }
            while(arr[j] == 1 && i < j){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return arr;
    }


    static int[] sort2(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    // Swap if bigger element comes before smaller
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


    static int[] sort1(int[] arr){
        int n = arr.length;
        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }


    static int[] swap(int[] arr,int i, int j){
        int temp;
        if(arr[i]>arr[j]){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
