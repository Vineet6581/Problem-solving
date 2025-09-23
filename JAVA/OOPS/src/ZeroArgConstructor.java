class Employee{
    //instance variable
    public String name;
    public int age;

    //zero argument constructor
    Employee(){
        System.out.println("Employee constructor called...");
    }

    //instance method
    public void display(){
        System.out.println("Name   :: "+name);
        System.out.println("Age    :: "+age);
    }
}

public class ZeroArgConstructor {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.display();
    }
}
