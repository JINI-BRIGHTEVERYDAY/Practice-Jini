package ConceptualLearning.Number7;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);

        for (Shape shape : shapes) {
            System.out.println("넓이는 " + shape.getArea());
        }

//        getArea()가 void일 때는 그냥 호출해서 내부에서 출력했지만,
//                위와 같이 double 반환 타입으로 변경하면 반환값을 출력문에서 직접 처리해야

    }
}
