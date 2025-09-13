package baitap02;

public class baitap02 {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 120);
        Vehicle bike = new Bike("Yamaha", 80);

        car.start();
        car.displayInfo();

        bike.start();
        bike.displayInfo();
    }
}
