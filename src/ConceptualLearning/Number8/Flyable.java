package ConceptualLearning.Number8;

public interface Flyable {
    public abstract void fly();

    default void land() {
        System.out.println("안전하게 착륙합니다.");
    }
}
