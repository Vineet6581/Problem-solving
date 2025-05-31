package Functions;

import java.util.Arrays;

// variable length arguments
public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,56,7,556,45,67);
        multiple(3,5,"vineet","gaurav","chandraveer");
        demo(3,4,5,6,7,78,6786,7,5,67,5,6,56,756,7,5,6);
        demo("himanshu","shikhar","shivam");

    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
     static void multiple(int a, int b, String ...u){
        System.out.println(Arrays.toString(u));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
