class calculator{
    public void add(int a , int b){
        System.out.println("int - int argument :: "+(a+b));
    }
    public void add(float a , float b){
        System.out.println("float - float argument :: "+(a+b));
    }
    public void add(double a , double b){
        System.out.println("double - double argument :: "+(a+b));
    }
}

public class Overloading {
    public static void main(String[] args) {
        calculator c = new calculator();
        c.add(1.00f,2.00f);
    }
}
