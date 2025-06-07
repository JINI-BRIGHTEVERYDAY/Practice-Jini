package ConceptualLearning.Number10;

public abstract class Animal implements Moveable, Soundable{
    private String name;


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void move() {
        System.out.println(getName() + "가 뛰어다닙니다");
    }

    @Override
    public void sound() {
        System.out.println(getName() + "가 소리를 냅니다.");
    }
}
