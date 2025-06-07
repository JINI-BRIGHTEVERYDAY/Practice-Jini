package ConceptualLearning.Number8;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();
        Bird bird = new Bird();

        car.move();
        car.stop();

        dog.move();
        dog.sound();
        dog.stop();

        bird.move();
        bird.sound();
        bird.fly();
        bird.land();
    }
}
