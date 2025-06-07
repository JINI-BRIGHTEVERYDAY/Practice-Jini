package ConceptualLearning.Number7;

public class Rectangle extends Shape {
    // 여기서는 클래스명에 abstract가 들어가서는 안된다.

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // getter 추가함 -> 왜? 멤버변수가 private이니까
    // 멤버 변수가 두 개라서 getter도 두 개 생겼다

    @Override
    public double getArea() {
        //System.out.println(width * height); 틀린 코드
        return width * height;
    }
}
