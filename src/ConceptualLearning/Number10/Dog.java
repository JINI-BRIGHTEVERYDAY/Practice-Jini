package ConceptualLearning.Number10;

public class Dog extends Animal implements Moveable, Soundable{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + "가 뛰어다닙니다.");
    }

    @Override
    public void sound() {
        System.out.println(getName() + "가 멍멍 짖습니다.");
    }


}
