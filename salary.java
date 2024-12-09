import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("enter your salary: ");
            int salary = input.nextInt();
            if(salary >= 10000){
                salary +=  2000;
            }
            else{
                salary += 1000;
            }
            System.out.print(salary);
        }
    }
}
