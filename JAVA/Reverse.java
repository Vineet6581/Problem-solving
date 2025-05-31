import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("enter a number:");
            int rev = 0;
            int n = input.nextInt();
            // for(int i=1;i<=n;i++){
            //     int digit = n%10;
            //     rev = rev*10+digit;
            //     n = n/10;
            // }
            while(n>0){
                int digit = n%10;
                rev = rev*10+digit;
                n = n/10;
            }
            System.out.print("reverse of the number:"+rev);
        }
    }
}
