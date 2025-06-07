package ConceptualLearning.Number4;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    // 이 부분 틀렸었음, 생성자 쓰기 유의합시다

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("멍멍");

    }
}
