package ConceptualLearning.Number7;

public class Circle extends Shape{
    // 여기서는 클래스명에 abstract가 들어가서는 안된다.

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    // getter 추가함 -> 왜? 멤버변수가 private이니까

    @Override
    public double getArea() {
        //System.out.println(Math.PI * radius * radius); 틀린 코드
        return Math.PI * radius * radius;
    }
}
