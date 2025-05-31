package ARRAYS;
import java.util.Arrays;
import java.util.Scanner;

public class input_1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// array of primitives
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 23;
        arr[2] = 54;
        arr[3] = 98;
        arr[4] = 90;
        //[3,23,54,98,90]
        System.out.println(arr[3]);

        //input using for loops
        System.out.println("enter the 5 integer values: ");
        for (int i = 0; i <  arr.length; i++ )
            arr[i] = input.nextInt();
        // method 1: printing the array
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        // method 2:another method to print array

        for(int num : arr)   // for every element in array, print the element
            System.out.print(num + " ");
        //here num represents elements of the array

        // method 3:another simple methode to print the array
        System.out.println();
        System.out.println(Arrays.toString(arr)); // easiest way to print the array
// array of objects
        System.out.println("enter the 5 string values: ");
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++)
            str[i] = input.next();
        System.out.println(Arrays.toString(str));
        System.out.println("modifying the value of the input array:");
        str[1] = "hello";
        System.out.println(Arrays.toString(str));
    }
}
