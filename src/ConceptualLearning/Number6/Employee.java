package ConceptualLearning.Number6;

public class Employee {
    private String name;
    private int salary;

    public Employee() {
    }
    // 자바에서는 기본 생성자가 없으면 상속 오류가 일어난다. 반드시 표기 필요 - 구글링

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    public void getDetails() {
        System.out.println("직원 [" + getName() + "] 의 급여는 [" + getSalary() + "] 원 입니다.");
    }


//    @Override
//    public String toString() {
//        return "직원 [" + name + "], 급여: [" + salary + "]원";
//    }

}
