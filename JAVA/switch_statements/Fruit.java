import java.util.Scanner;
public class Fruit{
    public static void main(String[] args) {
        System.out.print("Enter the fruit name: ");
        try(Scanner input =  new Scanner(System.in)){
            String fruit = input.next();
            switch (fruit.toLowerCase()) {
                case "mango" -> System.out.println("King of fruits");
                case "apple" -> System.out.println("A sweet red fruit");
                case "orange" -> System.out.println("Round fruit");
                case "grapes" -> System.out.println("Small fruit");
                default -> System.out.println("Please enter a valid fruit!");
            }
        }
    }
}
