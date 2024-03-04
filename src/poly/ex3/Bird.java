package poly.ex3;

public class Bird extends Animal implements Fly{

    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새가 퍼덕퍼덕 날아간다.");
    }
}
