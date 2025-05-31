import java.util.Scanner;

public class repeat {
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
        System.out.println("repeated number: "+item);
    }
    static int search(int[] arr){
        for(int i = 0; i < arr.length ; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
