package ConceptualLearning.Number8;

public class Dog implements Movable, Soundable{

    @Override
    public void move() {
        System.out.println("강아지가 뛰어다닙니다.");
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
