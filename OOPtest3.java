class Vihicle{
    String brand;

    public Vihicle(String brand){
        this.brand = brand;
    }

    public void printBrand(){
        System.out.println(brand);
    }
}

interface Drivable{
    public void drive();
}

class Car extends Vihicle implements Drivable{
    public Car(String brand){
        super(brand);
    }

    @Override
    public void drive(){
        System.out.println(brand + " is driving!");
    }

}

public class OOPtest3{
    public static void main(String[] args) {
        Car car1 = new Car("Tototyo");
        car1.printBrand();
        car1.drive();
    }
}