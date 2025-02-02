class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }
}

class Manager extends Employee {
    private String team;

    public Manager(String employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
        System.out.println("Team: " + team);
    }
}

public class Salary {
    public static void main(String[] args) {
        Employee employee = new Employee("E12345", "IT", 50000.0);
        System.out.println("Initial Salary: " + employee.getSalary());
        employee.setSalary(55000.0);
        System.out.println("Updated Salary: " + employee.getSalary());

        Manager manager = new Manager("M98765", "HR", 80000.0, "Recruitment");
        manager.displayDetails();
    }
}
