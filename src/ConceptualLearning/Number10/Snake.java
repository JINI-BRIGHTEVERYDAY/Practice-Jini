package ConceptualLearning.Number10;

public class Snake extends Animal implements Moveable {

    public Snake(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + "이 기어갑니다.");
    }

}
