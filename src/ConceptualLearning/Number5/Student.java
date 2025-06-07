package ConceptualLearning.Number5;

public class Student extends Person{
    private String school;

    public Student(String school) {
        this.school = school;
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void introduce() {
        super.introduce();

        // 이 부분을 세부적으로 추가함
        System.out.println("그리고 저는 [" + school + "] 에 다닙니다.");
    }


}
