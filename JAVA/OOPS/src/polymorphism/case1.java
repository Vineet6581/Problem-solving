// CASE-1 :: Automatic type promotion in Overloading
package polymorphism;
class calculator{
    public void add(int a){
        System.out.println("int argument");
    }
    public void add(float a){
        System.out.println("float argument");
    }
    public void add(double a){
        System.out.println("double argument");
    }
}

public class case1 {
    public static void main(String[] args) {
        calculator c = new calculator();
        c.add('a'); // char --> int
        c.add(19L); // long --> long,float,double
        c.add(10.5); // double --> double
    }
}
