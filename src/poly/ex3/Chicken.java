package poly.ex3;

public class Chicken extends Animal implements Fly{
    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }

    @Override
    public void fly() {
        System.out.println("닭은 잘 날지 못합니다.");
    }
}
