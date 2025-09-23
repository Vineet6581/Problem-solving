abstract class plane{
    public abstract void takeoff();
    public abstract void fly();
    public abstract void land();

}
class cargoplane extends plane{
    public void takeoff(){
        System.out.println("cargo plane tookoff...");

    }
    public void fly(){
        System.out.println("cargo plane flying...");
    }
    public void land(){
        System.out.println("cargo plane landing...");
    }
}

class passplane extends plane{
    public void takeoff(){
        System.out.println("passenger plane toofoff...");
    }
    public void fly(){
        System.out.println("passanger plane flying...");
    }
    public void land(){
        System.out.println("passanger plane landing...");
    }
}


class fighter extends plane{
    public void takeoff(){
        System.out.println("fighter plane toofoff...");
    }
    public void fly(){
        System.out.println("fighter plane flying...");
    }
    public void land(){
        System.out.println("fighter plane landing...");
    }
}

class airport {
    public void allowplane(plane ref){
        ref.takeoff();
        ref.fly();
        ref.land();
        System.out.println();
    }
}

public class Abstrac {
    public static void main(String[] args) {
//        plane plane = null;
//        plane = new plane();
//        passplane p = new passplane();
//        fighter f = new fighter();
//        cargoplane c = new cargoplane();
//
//        p.fly();
//        p.land();
//        p.takeoff();
//        System.out.println("\n");
//        f.fly();
//        f.land();
//        f.takeoff();
//        System.out.println("\n");
//        c.fly();
//        c.land();
//        c.takeoff();
//        System.out.println("\n");


        airport a = new airport();
        a.allowplane(new passplane());
        a.allowplane(new cargoplane());
        a.allowplane(new fighter());
    }
}
