import java.util.ArrayList;

class Course {
    String name;
    ArrayList<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + name);
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void showCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println(c.name);
        }
    }
}

class School {
    String name;
    ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        School school = new School("Greenwood High");
        Student s1 = new Student("John");
        Student s2 = new Student("Emma");
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        s1.enroll(math);
        s2.enroll(math);
        s1.enroll(science);

        math.showEnrolledStudents();
        s1.showCourses();
    }
}