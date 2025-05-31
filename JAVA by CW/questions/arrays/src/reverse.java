import java.util.Arrays;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(reverse(arr)));
    }
    static int[] reverse(int[] arr){
        int[] result = new int[arr.length];
        int i = 0;
        int j = arr.length-1;
        while(j>=0){
            result[i++] = arr[j--];
        }
        return result;
    }
}
