abstract class CourseType {
    String courseName;

    CourseType(String courseName) {
        this.courseName = courseName;
    }

    String getCourseName() {
        return courseName;
    }
}

class ExamCourse extends CourseType {
    ExamCourse(String courseName) {
        super(courseName);
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String courseName) {
        super(courseName);
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String courseName) {
        super(courseName);
    }
}

class Course<T extends CourseType> {
    private T course;

    Course(T course) {
        this.course = course;
    }

    void displayCourse() {
        System.out.println(
                "Course Type: " + course.getClass().getSimpleName() + " | Course Name: " + course.getCourseName());
    }
}

public class CourseManagement {
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>(new ExamCourse("Mathematics"));
        Course<AssignmentCourse> programming = new Course<>(new AssignmentCourse("Java Programming"));
        Course<ResearchCourse> aiResearch = new Course<>(new ResearchCourse("AI Innovations"));

        math.displayCourse();
        programming.displayCourse();
        aiResearch.displayCourse();
    }
}
