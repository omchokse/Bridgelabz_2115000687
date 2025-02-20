import java.util.*;

class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class EmployeeGrouping {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR"),
                new Employee("David", "IT"),
                new Employee("Eve", "Finance"));

        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            departmentMap
                    .computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>())
                    .add(emp);
        }

        departmentMap.forEach((dept, empList) -> System.out.println(dept + ": " + empList));
    }
}
