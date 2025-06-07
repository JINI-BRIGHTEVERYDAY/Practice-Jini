package ConceptualLearning.Number1;

/* 문제 2: 자동차(Car) 클래스 만들기

📌 요구 사항
속성 (필드)

brand: 자동차 브랜드 이름 (예: "현대", "기아")

speed: 자동차 속도 (정수형, 예: 100)

생성자

brand와 speed를 매개변수로 받아서 초기화

        메서드

drive()
→ 출력: [브랜드]가 시속 [속도]km로 달립니다.

main() 메서드에서 테스트

Car 객체 하나 만들고

drive() 메서드 호출하기 */

public class Car {
    String brand;
    int speed;

    // Private 사용하기

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void drive() {
        System.out.println(brand + "가 " + "시속" + speed + "km 로 달립니다.");
    }

}
