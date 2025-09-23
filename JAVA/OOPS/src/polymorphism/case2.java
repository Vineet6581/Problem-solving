// CASE-2 :: Ambigous method call compilerTime Error in Overloading
package polymorphism;
class Calculator{
    public void add(int a,float b){
        System.out.println("int-float argument");
    }
    public void add(float a,int b){
        System.out.println("float-int argument");
    }
}

public class case2 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
//        c.add(10,20); gives the error of case 2
        c.add(10.5f,10);
        c.add(10,10.5f);
    }
}
