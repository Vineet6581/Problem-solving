import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first matrix
        System.out.println("Enter rows and columns of Matrix A:");
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();
        int[][] A = new int[rowsA][colsA];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter rows and columns of Matrix B:");
        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();
        int[][] B = new int[rowsB][colsB];

        // Check for multiplication condition
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. Columns of A must equal rows of B.");
            return;
        }

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Resultant matrix
        int[][] result = new int[rowsA][colsB];

        // Matrix multiplication logic
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display the result
        System.out.println("Resultant Matrix (A x B) is:");
        for (int i = 0; i < rowsA; i++) {
            System.out.print("[ ");
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}
