package Arrays.MultiDiaarray;

public class add {
    public static void main(String[] args) {
        int arr1[][] = {{1,52,53},{34,54,23},{98,23,43}};
        int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};
        if(arr1.length == arr2.length && arr1[0].length == arr2[0].length) {
            int[][] arr = new int[arr1.length][arr2[0].length];
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    arr[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        } else{
            System.out.print("Row and column length of matrices should be same");
        }
    }
}
