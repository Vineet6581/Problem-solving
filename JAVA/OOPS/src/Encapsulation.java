class Student{
    // Data-Security
    private int rollNo;
    private String name;
    private String address;

    // setter methods
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }


    // getter methods
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        // calling setter methods to set the value
        s.setName("vineet");
        s.setAddress("saviour");
        s.setRollNo(130283);


        // caliing getter methods to get the value
        System.out.println("Name    :: "+ s.getName());
        System.out.println("RollNo  :: "+ s.getRollNo());
        System.out.println("Address :: "+ s.getAddress());


    }
}
