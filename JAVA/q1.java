// // Write separate programs that shows the implementation of (i) static variable and static member function (ii) static block concept.
class StaticExampl {
    static int count = 0;

    static void incrementCount() {
        count++;
    }

    public static void main(String[] args) {
        System.out.println("Initial count: " + count);
        incrementCount();
        System.out.println("Count after increment: " + count);
    }
}
