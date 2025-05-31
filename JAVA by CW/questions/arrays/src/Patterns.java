import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the target:");
        int target = input.nextInt();

        int[][] pair = search(arr, target);
        System.out.println("Pairs: " + Arrays.deepToString(pair));

        int count = count(arr, target);
        System.out.println("Count: " + count);
    }

    static int[][] search(int[] arr, int target) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // j starts from i+1 to avoid duplicates and self-pairs
                if (arr[i] + arr[j] >= target) {
                    count++;
                }
            }
        }

        int[][] result = new int[count][2];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] >= target) {
                    result[index][0] = arr[i];
                    result[index][1] = arr[j];
                    index++;
                }
            }
        }
        return result;
    }

    static int count(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] >= target) {
                    count++;
                }
            }
        }
        return count;
    }
}
