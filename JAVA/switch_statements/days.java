import java.util.Scanner;
public class days {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("enter number between 1 to 7:");
            int num = input.nextInt();
            switch(num){
                case 1,2,3,4,5 -> System.out.println("weekday");
                case 6,7 -> System.out.println("Weekend");
            }
        }
    }
}
