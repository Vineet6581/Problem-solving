import java.util.Scanner;
public class Abc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1 ; i <= n; i++){
//            char a = 65;
            for(int j = 1; j <= n; j++){
                System.out.print((char)(j+64)+" ");
//                a++;
            }
            System.out.println();
        }
    }
}
