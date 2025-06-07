package ConceptualLearning.Number5;

public class Person {
    private String name;
    private int age;


    public Person() {
    }

    // 이 부분에서 틀림 private로 걸려있음
    // 자식 클래스에서 속성에 접근할 수가 없다.

    // 그러므로 아래처럼 getter 쓰기
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("안녕하세요, 저는 [" + getName() + "] 이고, [" + getAge() + "] 살 입니다."  );
    }

    // 위에서 getter를 쓰지 않았으므로, 여기서도 틀림
    // name, age를 getName, getAge로 수정하기

}
