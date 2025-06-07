package ConceptualLearning.Number8;

public class Bird implements Movable, Soundable, Flyable{

    @Override
    public void move() {
        System.out.println("새가 날갯짓하며 이동합니다.");
    }

    /*@Override
    public void stop() {
        Movable.super.stop();
    }*/

    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새가 하늘을 날고 있습니다.");
    }

    // land 메서드는 기본 구현 가능함
    @Override
    public void land() {
        Flyable.super.land();
    }
}
