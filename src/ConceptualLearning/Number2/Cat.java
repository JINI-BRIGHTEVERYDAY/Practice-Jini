package ConceptualLearning.Number2;
/*
Step 1: 연습문제 1번부터 시작
예를 들어:

[문제 1] ‘고양이’ 클래스 만들기

속성: 이름(name), 나이(age)

메서드: meow() → 콘솔에 "야옹~ 나는 [이름]" 출력

main()에서 객체 생성하고, 메서드 호출하기
*/


public class Cat {

    // 속성 정하기
    String name;
    int age;

    // 생성자 나타내기

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        // 클래스 내부 변수 this.name, this.age에 생성자 매개변수 name, age를 넣어준다
        // 생성자에서 필드 초기화, 생성자 (Constructor) 안에서 클래스의 속성 (필드)값을
        // 처음으로 지정하는 것
        // 객체가 만들어질 때 속성값을 설정하는 과정
    }

    /*
    * 이렇게 쓰면 안되나?
    *   public Cat() {

          }
          *
          * public Cat() { } → 값 안 넣음 (null or 0)

            public Cat(String name) {
            *      this.name = name; } → 값 넣음 = 초기화 O
    * */

    // 메서드 정의하기
    public void meow() {
        System.out.println("야옹 나는" + name );
    }
}
