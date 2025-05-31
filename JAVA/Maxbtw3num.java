import java.util.Scanner;

public class Maxbtw3num {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("enter 3 num: ");
            int a =  input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            // int max = a;
            // if(b > max){
            //     max = b;
            // }
            // if(c > max){
            //     max = c;
            // }
            int max = Math.max(c,Math.max(a,b));
            System.out.print("maximum number:"+max);
        }
    }
}
