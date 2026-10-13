interface Drivable{
    void drive();
}

class Car implements Drivable{
    @Override
    public void drive(){
        System.out.println("Driving a car on the road!");
    }
}

class Boat implements Drivable{
    @Override
    public void drive(){
        System.out.println("Sailing a boat on water!");
    }
}

public class Inter{
    public static void main(String[] args) {
        Drivable car = new Car();
        Drivable boat = new Boat();

        car.drive();
        boat.drive();
    }
}