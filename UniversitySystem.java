import java.util.ArrayList;

class Faculty {
    String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void showFaculty() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String name;
    ArrayList<Faculty> faculties;

    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDepartment() {
        System.out.println("Department: " + name);
        for (Faculty f : faculties) {
            f.showFaculty();
        }
    }
}

class University {
    String name;
    ArrayList<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void showUniversity() {
        System.out.println("University: " + name);
        for (Department d : departments) {
            d.showDepartment();
        }
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        University university = new University("Global University");
        Department cs = new Department("Computer Science");
        Department ee = new Department("Electrical Engineering");

        Faculty prof1 = new Faculty("Dr. Smith");
        Faculty prof2 = new Faculty("Dr. Johnson");

        cs.addFaculty(prof1);
        ee.addFaculty(prof2);

        university.addDepartment(cs);
        university.addDepartment(ee);
        university.showUniversity();
    }
}