import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter a character:");
            char ch = input.next().trim().charAt(0);
            if( ch >= 'a' && ch <= 'z'){
                System.out.println(ch+ " is lowercase");
            }
            else{
                System.out.println(ch+ " is uppercase");
            }
        }
        
    }
}
// import java.util.Scanner;
// public class CaseCheck {
//     public static void main(String[] args) {
//         try (Scanner input = new Scanner(System.in)) {
//             System.out.println("Enter a single character:");
//             String userInput = input.next().trim();
//             if (userInput.length() != 1) {
//                 System.out.println("Invalid input. Please enter only one character.");
//                 return;
//             }
//             char ch = userInput.charAt(0);
//             if (Character.isLowerCase(ch)) {
//                 System.out.println(ch + " is lowercase.");
//             } else if (Character.isUpperCase(ch)) {
//                 System.out.println(ch + " is uppercase.");
//             } else {
//                 System.out.println(ch + " is not an alphabetic character.");
//             }
//         }
//     }
// }
