import java.util.Scanner;
public class nested_switch {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter the employee id:");
            int empID = input.nextInt();
            String department = input.next();
            switch(empID){
                case 1 -> System.out.println("Vineet Chaudhary");
                case 2 -> System.out.println("banto");
                case 3 -> System.out.println("Muthiya ji");
                case 4 -> {
                    switch(department){
                        case "IT" -> System.out.println("IT DEPARTMENT");
                        case "CS" -> System.out.println("CS DEPARTMENT");
                        default -> System.out.println("No department");
                    }
                }
                default -> System.out.println("Enter a valid empID!");
            }
        }
    }
}
