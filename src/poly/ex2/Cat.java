package poly.ex2;

public class Cat implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("냥냥");
    }

    @Override
    public void move() {
        System.out.println("동공 커진 후 달려들기!");
    }
}
