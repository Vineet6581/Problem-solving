import java.util.Scanner;
public class Occurence {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("enter a number:");
            int num = input.nextInt();
            System.out.print("Enter the number to be searched for occurance:");
            int n = input.nextInt();
            int count = 0;
            while (num > 0) {
                int rem = num % 10;
                if(rem == n){
                    count = count + 1;
                }
                num = num/10;
        }
            System.out.print(count);
        }
    }
}
