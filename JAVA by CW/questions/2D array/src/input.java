import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns: ");
        int row = input.nextInt();
        int col = input.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter the elements (row-wise):");
        for (int i = 0; i < row; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < col; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMatrix is:");
        for (int i = 0; i < row; i++) {
            System.out.print("[ ");
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}
