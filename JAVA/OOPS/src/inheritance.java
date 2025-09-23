class person{
    public String name;
    public String address;
    public int age;
}

class student extends person {
    //instance variable
    public int marks;
    public String grade;

    // constructor
     student(String name,String address, int age, int marks,String grade){
         this .name = name;
         this.address = address;
         this.age = age;
         this.marks = marks;
         this.grade = grade;
     }
     // normal method
     public void display(){
         System.out.println("Name    :: "+name);
         System.out.println("Address :: "+address);
         System.out.println("Age     :: "+age);
         System.out.println("Marks   :: "+marks);
         System.out.println("grade   :: "+grade);
     }
}

public class inheritance {
    public static void main(String[] args) {
        student s1 = new student("vineet","saviour greenisle",20,1433,"A");
        s1.display();
    }
}
