import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("enter n = ");
            int n = input.nextInt();
        int  i =1;
            do{
                System.out.println(i);
                i++;
            }while(i <= n);
        }
    }
}
