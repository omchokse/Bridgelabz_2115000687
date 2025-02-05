import java.util.ArrayList;

class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public void displayEmployee() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String name;
    ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayDepartment() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}

class Company {
    String name;
    ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayCompany() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }
}

public class CompanySystem {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department dept1 = new Department("IT");
        Department dept2 = new Department("HR");

        dept1.addEmployee(new Employee("John"));
        dept1.addEmployee(new Employee("Alice"));
        dept2.addEmployee(new Employee("Bob"));

        company.addDepartment(dept1);
        company.addDepartment(dept2);

        company.displayCompany();
    }
}