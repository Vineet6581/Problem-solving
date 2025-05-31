package Functions;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(20,30);
        System.out.println(ans);
    }
    // normally using the function
    static void sum(){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter 2 numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int sum = num1 + num2;
            System.out.print("Sum is "+sum);
        }
        //return the value
    }
    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum;
        sum = num1 + num2;
        return sum;
    }
    // pass the values of the numbers when you are calling the method in main()
    static int sum3(int a , int b){
       int sum = a+b;
        return sum;
    }
}
    /*
        return_type name(){
             //body
        return statement;
        }
    */

