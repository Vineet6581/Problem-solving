package polymorphism;

class Plane{
    public void takeoff(){
        System.out.println("Plane tookOff...");
    }
    public void fly(){
        System.out.println("Plane is flying...");
    }
    public void land(){
        System.out.println("Plane is landing...");
    }
}
class CargoPlane extends Plane{
    public void takeoff(){
        System.out.println("Cargo-Plane tookOff...");
    }
    public void fly(){
        System.out.println("Cargo-Plane is flying...");
    }
    public void land(){
        System.out.println("Cargo-Plane is landing...");
    }
}

class FighterPlane extends Plane{
    public void takeoff(){
        System.out.println("Fighter-Plane tookOff...");
    }
    public void fly(){
        System.out.println("Fighter-Plane is flying...");
    }
    public void land(){
        System.out.println("Fighter-Plane is landing...");
    }
}

class PassengerPlane extends Plane{
    public void takeoff(){
        System.out.println("Passenger-Plane tookOff...");
    }
    public void fly(){
        System.out.println("Passenger-Plane is flying...");
    }
    public void land(){
        System.out.println("Passenger-Plane is landing...");
    }
}

class Airport{
    public void AllowPlane(Plane p){
        p.takeoff();
        p.fly();
        p.land();
        System.out.println();
    }
}


public class overridingEXAMPLE {
    public static void main(String[] args) {
        CargoPlane c = new CargoPlane();
//                c.takeoff();
//                c.fly();
//                c.land();
        FighterPlane f = new FighterPlane();
//                f.takeoff();
//                f.fly();
//                f.land();
        PassengerPlane p = new PassengerPlane();
//                p.takeoff();
//                p.fly();
//                p.land();



        Airport a = new Airport();
        a.AllowPlane(c);
        a.AllowPlane(f);
        a.AllowPlane(p);

    }
}
