package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectronicCar electronicCar = new ElectronicCar();
        electronicCar.move();
        electronicCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
