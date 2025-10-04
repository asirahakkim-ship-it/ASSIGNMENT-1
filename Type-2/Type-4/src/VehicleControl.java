abstract class Vehicle {
    abstract void start();
    abstract void stop();
}
 class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Start the car");

    }
    void stop(){
        System.out.println("Stop the car");
    }

}
class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Start the Bike");
    }

    void stop(){
        System.out.println("Stop the Bike");
    }
}


public class VehicleControl {
    public static void main(String[] args) {
        Vehicle c1=new Car();
        c1.start();
        c1.stop();
        Vehicle b1=new Bike();
        b1.start();
        b1.stop();
    }
}
