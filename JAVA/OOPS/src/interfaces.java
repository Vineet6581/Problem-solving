interface ICalculator{
    void add(int a , int b);
    void sub(int a , int b);
    void mul(int a  , int b);
    void div(int a , int b);
}
class CalculatorImpl implements ICalculator{
    public void add(int a , int b){
        System.out.println("The sum is :: "+(a+b));
    }
    public void sub(int a , int b){
        System.out.println("The sum is :: "+(a-b));
    }
    public void mul(int a , int b){
        System.out.println("The sum is :: "+(a*b));
    }
    public void div(int a , int b){
        System.out.println("The sum is :: "+(a/b));
    }

}


public class interfaces {
    public static void main(String[] args) {
        // loose coupling : polimorphism
        ICalculator calculator = new CalculatorImpl();
        calculator.add(10,20);
        calculator.sub(10,20);
        calculator.mul(10,20);
        calculator.div(100,20);
    }
}
