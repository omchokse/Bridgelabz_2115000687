class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double newCGPA) {
        if (newCGPA >= 0 && newCGPA <= 10) {
            CGPA = newCGPA;
        } else {
            System.out.println("Invalid CGPA value.");
        }
    }
}

class PostgraduateStudent extends Student {
    private String thesisTitle;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA);
        this.thesisTitle = thesisTitle;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Thesis Title: " + thesisTitle);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student(101, "John Doe", 8.5);
        System.out.println("Initial CGPA: " + student.getCGPA());
        student.setCGPA(9.0);
        System.out.println("Updated CGPA: " + student.getCGPA());

        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Jane Smith", 9.2, "AI in Healthcare");
        pgStudent.displayDetails();
    }
}
