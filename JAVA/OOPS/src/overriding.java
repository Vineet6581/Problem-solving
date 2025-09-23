class parent{
    public void property(){
        System.out.println("Land+Cash+Gold");
    }
    public void marry(){
        System.out.println("Relative girl");
    }
}

class child extends parent{
    // Overriding
    public void marry(){
        // Re-Implementation
        System.out.println("SomeOther girl...");
    }
}


public class overriding {
    public static void main(String[] args) {
        //parent object
        parent p = new parent();
        p.property();
        p.marry();
        System.out.println();

        // child object
        child c = new child();
        c.property();
        c.marry();

        System.out.println();

        //child object
        parent p2 = new child();
        p2.property();
        p2.marry();
    }
}
