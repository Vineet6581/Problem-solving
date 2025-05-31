package Functions;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.print(a + " " + b);
        swap(a, b);
        System.out.println(a + " " + b);
        String name = "vineet chaudhary";
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String name){
        name = "Buggu";
    }
   static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
