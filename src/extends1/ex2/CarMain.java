package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectronicCar electricCar = new ElectronicCar();
        electricCar.move();
        electricCar.charge();
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
