package ConceptualLearning.Number6;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("홍길동", 3000000);
        Manager manager = new Manager("지니", 5000000, "개발부");

        employee.getDetails();
        manager.getDetails();

//        System.out.println(employee);  // 자동으로 employee.toString() 호출
//        System.out.println(manager);   // manager.toString() 호출

    }
}
