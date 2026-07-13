class Vehicle{
    void start(){
        System.out.println("start vehicle ");
    }
}

class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("car start");
    }
}

class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("bike start");
    }
}

/**
 * day6oop2
 */
public class day6oop2 {

    public static void main(String[] args) {
        Vehicle ob ;
        ob= new Car();
        ob.start();
        ob = new Bike();
        ob.start();
        ob = new Vehicle();
        ob.start();
    }
}