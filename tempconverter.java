import java.util.Scanner;

public class tempconverter {
    public static void main(String[] args) {
        System.out.println("enter the temperature in celsius: ");
        try(Scanner input = new Scanner(System.in)){
            float tempC = input.nextFloat();
            float tempF = (tempC * 9/5)+ 32;
            System.out.println(tempF);
        }
    }
}
