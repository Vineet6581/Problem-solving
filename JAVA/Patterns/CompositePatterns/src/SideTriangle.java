import java.util.Scanner;
public class SideTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <=n; i++){
            for(int j = i;j<n;j++){
                System.out.print(" "+" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        // METHOD : 2
//        for(int i = 1; i <= n ; i++){
//            for(int j = 1; j <= n;j++){
//                if(i+j > n){
//                    System.out.print("* ");
//                } else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
    }
}

