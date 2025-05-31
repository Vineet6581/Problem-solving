package Functions;

public class Overloading {
    public static void main(String[] args) {
        fun(12);
        fun("Vineet chaudhary");
       int ans = sum(3,4);
       int asn = sum(3,4,5);
       System.out.println(ans);
       System.out.println(asn);

    }
    static int sum(int a , int b){
        return a+b;
    }
    static int sum(int a , int b, int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
