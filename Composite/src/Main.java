import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee("George");
        Employee em2 = new Employee("Steve");
        List<Component> employees = new ArrayList<>();
        employees.add(em1);
        employees.add(em2);
        Department dep1 = new Department("Engeneering",employees);
        Employee em3 = new Employee("Peter");
        Employee em4 = new Employee("Alex");
        List<Component> employees1 = new ArrayList<>();
        employees1.add(em3);
        employees1.add(em4);
        employees1.add(dep1);
        Department dep2 = new Department("Lifecell", employees1);
        dep2.printInfo();
    }
}