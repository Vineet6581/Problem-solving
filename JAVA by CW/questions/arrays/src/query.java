import java.util.Arrays;
import java.util.Scanner;

public class query {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int[] frequency = makefrequencyarray(arr);

        System.out.println("Enter the number of queries:");
        int q = input.nextInt();
        while(q > 0){
            System.out.println("enter the number to be searched: ");
            int x = input.nextInt();
            if(frequency[x]>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            q--;
        }
    }
    static int[] makefrequencyarray(int[] arr){
        int[] freq = new int[100005];
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
}
