package LOOPS;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        if(n%2 == 0) System.out.println("even number");
        else System.out.println("odd number");
    }
}
