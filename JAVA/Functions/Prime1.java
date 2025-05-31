package Functions;
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Prime1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        prime(num);
    }
    static void prime(int a){
        int flag = 0,i;
        if(a == 0 || a ==1){
            flag = 1;
        }
        else{
            for(i=2;i<=sqrt(a);i++){
                if(a%i==0){
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 1){
            System.out.println("NOT A PRIME");
        }
        else{
            System.out.println("PRIME");
        }
    }
}
