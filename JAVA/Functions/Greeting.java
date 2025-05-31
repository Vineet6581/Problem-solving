package Functions;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.print(message);
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String naam = input.next();
        String personalised = mygreet(naam);
        System.out.println(personalised);
    }
    static String mygreet(String name){
        String message = "Hello " + name;
        return message;
    }
    static String greet() {
        String greeting = "hello world";
        return greeting;
    }
}
