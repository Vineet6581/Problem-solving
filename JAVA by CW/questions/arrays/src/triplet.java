import java.util.Scanner;
import java.util.Arrays;
public class triplet {
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
    static int[][] search(int[]arr, int target){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                for(int k =j+1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        count++;
                    }
                }

            }
        }
        int[][] result = new int[count][3];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                for(int k =j+1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        result[index][0] = arr[i];
                        result[index][1] = arr[j];
                        result[index][2] = arr[k];
                        index++;
                    }
                }
            }
        }
        return  result;
    }
    static int count(int[] arr, int target){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                for(int k =j+1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        count++;
                    }
                }

            }
        }
        return count;
    }
}
