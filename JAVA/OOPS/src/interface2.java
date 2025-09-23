interface ICalculator2{
    // public abstract
    void add(int a , int b);
    void sub(int a , int b);
}

interface  IAdvancedCalculator{
    // public abstract
    void mul(int a , int b);
    void div(int a , int b);
}

 class Calculator2Impl implements ICalculator2,IAdvancedCalculator{

    // ICalculator
    public void add(int a , int b){
        System.out.println("the sum is :: "+(a+b));
    }
    public void sub(int a , int b){
        System.out.println("the diff is :: "+(a-b));
    }

    // IAdvanceCalculator
    public void mul(int a , int b){
        System.out.println("the mul is :: "+(a*b));
    }
    public void div(int a , int b){
        System.out.println("the div is :: "+(a/b));
    }
}

public class interface2 {
    public static void main(String[] args) {
        //loose coupling : polymorphism
        ICalculator2 calculator = new Calculator2Impl();
        calculator.add(10,20);
        calculator.sub(20,10);

        IAdvancedCalculator advcalculator = new Calculator2Impl();
        advcalculator.mul(10,20);
        advcalculator.div(200,20);
    }
}
