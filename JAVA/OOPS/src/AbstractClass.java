// Exposing the set of services but hiding the internal implementation

class Person{
    String name;
    int age;
    float height;

    Person(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
class Std extends Person{
    int marks;
    float avg;
    Std(String name, int age, float height,int marks, float avg){
        // To call parameterised constructor of parent from child child classeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
        super(name,age,height);
        this.marks= marks;
        this.avg = avg;
    }
    public void display(){
        System.out.println("Name   :: "+name);
        System.out.println("Age    :: "+age);
        System.out.println("Height :: "+height);
        System.out.println("Marks  :: "+marks);
        System.out.println("Avg    :: "+avg);
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Std student = new Std("vineet",20,5.8f,1433,8.045f);
        student.display();
    }
}
