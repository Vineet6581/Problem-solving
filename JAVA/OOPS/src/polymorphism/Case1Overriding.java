// in case of  overriding, we can't change the returntype of the method

package polymorphism;
class Parent{
//    public object methodone(){
//        return null;
//    }

    public Object methodone(){
        return null;
    }
}
class child extends Parent{
    public String methodone(){
        System.out.println("child is calling...");
        return null;
    }
}
public class Case1Overriding {
    public static void main(String[] args) {
        Parent p = new child();
        p.methodone();
    }
}
