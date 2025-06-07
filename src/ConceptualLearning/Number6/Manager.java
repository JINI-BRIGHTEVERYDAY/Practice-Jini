package ConceptualLearning.Number6;

public class Manager extends Employee{
    private String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void getDetails() {
        //super.getDetails(); 이 부분 없어도 된다.
        //부모 생성자로부터 오버라이딩한 메서드를 변형할 수 있다.
        // 굳이 super...쓰지 않아도 된다.

        System.out.println("관리자 ["+ getName()+ "], 부서: [" + department + "], 급여: [" + getSalary() + "]원입니다.");


    }

//    @Override
//    public String toString() {
//        return "관리자 [" + getName() + "], 부서: [" + department + "], 급여: [" + getSalary() + "]원";
//    }

}
