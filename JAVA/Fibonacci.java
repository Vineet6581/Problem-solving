// import java.util.Scanner;
// public class Fibonacci{
//         public static void main(String[] args){
//             try(Scanner input = new Scanner(System.in)){
//                 System.out.print("enter the number of terms:");
//                 int n = input.nextInt();
//                 int a;
//                 int b = 1;
//                 int c = 0;
//                 for(int i = 0;i < n; i++){
//                     a = b;
//                     b = c;
//                     c = a+b;
//                     System.out.println(c);
//                 }
//             }
//         }
// }

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("enter the number of terms:");
            int n = input.nextInt();
            int a = 0;
            int b = 1;
            int count = 2;
            while(count <= n){
                int c = b;
                b = b+a;
                a = c;
                count++;
                System.out.println(b);
            }
        }
    }
}