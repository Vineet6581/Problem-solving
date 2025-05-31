import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            while(true) {
                System.out.print("Enter 2 number: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.print("Enter an operator: ");
                char op = input.next().trim().charAt(0);
                if(op == '+' || op == '-' ||  op == '*' || op == '/' || op == '%'){
                    if(op == '+'){
                        System.out.println("ANSWER: "+(num1+num2));
                    }
                    if(op == '-'){
                        System.out.println("ANSWER: "+(num1-num2));
                    }
                    if(op == '*'){
                        System.out.println("ANSWER: "+(num1*num2));
                    }
                    if(op == '/'){
                        if( num2 != 0){
                            System.out.println("ANSWER: "+(num1/num2));
                        }
                    }
                    if(op == '%'){
                        System.out.println("ANSWER: "+(num1%num2));
                    }
                }
                else if(op == 'x' || op == 'X'){
                    break;
                }
                else{
                    System.out.print("Invalid input please try again!!!");
                    System.out.println();
                }
            }
        }
    }
}