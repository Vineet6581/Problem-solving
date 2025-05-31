import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns: ");
        System.out.println("The number of rows and columns should be equal");
        int n = input.nextInt(); // For square matrix, rows = cols

        int[][] arr = new int[n][n];
        System.out.println("Enter the elements row by row: ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("Element at (" + i + "," + j + "): ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("\nORIGINAL ARRAY:");
        toprintArray(arr);

        rotate(arr, n);

        System.out.println("Rotation of the matrix: ");
        toprintArray(arr);
    }

    static void toprintArray(int[][] arr) {
        for(int[] row : arr) {
            for(int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Transpose in-place (for square matrix only)
    static void toTranspose(int[][] arr, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    // Reverse each row
    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Rotate matrix 90° clockwise
    static void rotate(int[][] arr, int n) {
        toTranspose(arr, n);            // Step 1: Transpose
        for(int i = 0; i < n; i++) {    // Step 2: Reverse each row
            reverseArray(arr[i]);
        }
    }
}
