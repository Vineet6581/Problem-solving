package Functions;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        boolean ans = isarm(n);
//        System.out.println(ans);
        for(int i=100; i < 1000; i++){
            if(isarm(i)){
                System.out.print(i +" ");
            }
        }
    }
    static boolean  isarm(int n){
        int sum = 0;
        int original = n;
        while(n>0) {
            int digit = n % 10;
            int cube = digit * digit * digit;
            sum += cube;
            n = n / 10;
        }
        return sum == original;
    }
}
