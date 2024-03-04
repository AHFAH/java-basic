package poly.ex2;

public class InterfaceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        soundAnimal(dog);
        soundAnimal(cat);

        moveAnimal(dog);
        moveAnimal(cat);
    }

    private static void soundAnimal(InterfaceAnimal animal){
        System.out.println("동물 울기 시작");
        animal.sound();
    }

    private static void moveAnimal(InterfaceAnimal animal){
        System.out.println("동물들 움직이기 시작");
        animal.move();
    }
}
