package ConceptualLearning.Number8;

public interface Movable {
    public abstract void move();

    //public abstract void move(); 여기서 매개변수를 추가할 수도 있다.

    // 인터페이스 기본 메서드
    default void stop() {
        System.out.println("움직임을 멈춥니다.");
    }
}
