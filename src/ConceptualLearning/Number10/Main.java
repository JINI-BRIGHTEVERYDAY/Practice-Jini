package ConceptualLearning.Number10;

public class Main {
    public static void main(String[] args) {
        Moveable[] moveables = new Moveable[3];

        moveables[0] = new Dog("복덩이");
        moveables[1] = new Cat("야옹이");
        moveables[2] = new Snake("꼬북이");

        for(Moveable m : moveables ) {
            m.move();
        }

        Soundable[] soundables = new Soundable[2];

        soundables[0] = new Dog("복덩이");
        soundables[1] = new Cat("야옹이");

        for(Soundable s : soundables) {
            s.sound();


        }
    }

}
