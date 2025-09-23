import java.util.Scanner;
public class special {
    public static void main(String[] args) {
        // write your code logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = n*(n+1)/2;
        int start = a-n+1;
        for (int i = n; i >= 1; i--) {   // rows reverse order me
            for (int j = start; j < start + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            start -= (i - 1);  // agle row ke liye update
        }
    }
}
