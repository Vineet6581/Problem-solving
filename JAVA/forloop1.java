import java.util.Scanner;
public class forloop1 {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("enter the value of num");
            int num = input.nextInt();
            for(int i=1;i<=num;i++){
            System.out.println(i);
        }
        }
    }
}
