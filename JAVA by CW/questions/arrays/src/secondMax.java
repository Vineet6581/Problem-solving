import java.util.Scanner;

public class secondMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements of the array: ");
        for(int i =0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        int item = search(arr);
        System.out.println("2nd maximum number: "+item);
    }
    static int search(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int mx = Integer.MIN_VALUE;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != max && arr[j]>mx){
                    mx = arr[j];
            }
        }
        return mx;
    }
}
