package Functions;

public class Shadowing {
    static int x = 90; // this will be shadowed at line 8
    public static void main(String[] args) {
       System.out.println(x); //90
       int x;       // the class variable at line 4 is shadowed by this
  //      System.out.println(x); this will give me an error
        // so the scope will actually begin when the value is initialised.
       x = 40;
       System.out.println(x); //40
       fun();
    }
    static void fun(){
        System.out.println(x); //90
    }
}
// shadowing in java is basically a practice of using 2 variables with the same name within the scope that overlaps.