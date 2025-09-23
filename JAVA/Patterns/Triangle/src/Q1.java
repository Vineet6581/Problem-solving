import java.util.Scanner;
class Q1 {
    public static void main(String[] args) {
        // write your code logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = n;
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print(a+" ");

            }
            a--;
            System.out.println();
        }
    }
}