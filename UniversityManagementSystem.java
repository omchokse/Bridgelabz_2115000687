import java.util.ArrayList;

class Professor {
    String name;

    public Professor(String name) {
        this.name = name;
    }
}

class Course {
    String name;
    Professor professor;
    ArrayList<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + name);
        if (professor != null) {
            System.out.println("Professor: " + professor.name);
        }
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Course course = new Course("Data Structures");
        Professor professor = new Professor("Dr. Adams");
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        course.assignProfessor(professor);
        course.enrollStudent(s1);
        course.enrollStudent(s2);

        course.showCourseDetails();
    }
}