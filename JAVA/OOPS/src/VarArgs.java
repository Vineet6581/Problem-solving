class Calc{
    public void add(int... args){
        int sum = 0;
        for(int data : args){
            sum += data;
        }
        System.out.println(sum);
    }
}

public class VarArgs {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.add();
        c.add(10);
        c.add(10,20);
        c.add(10,20,30);
    }
}
