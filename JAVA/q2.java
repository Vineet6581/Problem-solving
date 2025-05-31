// static block concept
class StaticBlockDemo {
    static int number;

    static {
        number = 10;
        System.out.println("Static block executed. Number initialized to: " + number);
    }
    
    public static void main(String[] args) {
        System.out.println("Main method executed.");
        System.out.println("Value of number: " + number);
    }
}
