package ConceptualLearning.Number10;

public class Cat extends Animal implements Moveable, Soundable{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + "가 살금살금 걷습니다.");
    }

    @Override
    public void sound() {
        System.out.println(getName() + "가 야옹 웁니다.");
    }

}
