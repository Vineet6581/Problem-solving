import java.util.Scanner;
public class Greatestof3num {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("enter three numbers: ");
            int A = input.nextInt();
            int B = input.nextInt();
            int C = input.nextInt();
        if(A!=B && B!=C && C!=A){
                if(A>B){
                if(A>C){
                    System.out.print("A is greater");
                }
                else{
                    System.out.print("C is greater");
                }
            }
            else{
                if(B>C){
                    System.out.println("B is greater");
                }
                else{
                    System.out.println("C is greater");
                }
            }
        }
        else{
                if(A==B && B!=C){
                    if(A>C){
                        System.out.println("A and B are the same and greater than C");
                    }
                    else{
                        System.out.println("C is greater");
                    }
                }
                else if(B==C && A!=B){
                    if(B>A){
                        System.out.println("B and C are same and greater than A");
                    }
                    else{
                        System.out.println("A is greater");
                    }
                }
                else if(A==C && A!=B){
                    if(A>B){
                        System.out.println("A and C are same and greater than B");
                    }
                    else{
                        System.out.println("B is greater");
                    }
                }
                else{
                    System.out.println("All the inputs are same");
                }
            }
        }
    }
}
