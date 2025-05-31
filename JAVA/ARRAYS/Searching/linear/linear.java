package ARRAYS.Searching.linear;
import java.util.Scanner;
public class linear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("enter value to be search:");
        int value = input.nextInt();
        int flag = 0;
        for(int i=0;i<arr.length;i++){
            if(value == arr[i]){
                System.out.println("the value"+" " + value + " "+"is found at" +"  " + i +" " + "position");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("value not found");
    }
}
