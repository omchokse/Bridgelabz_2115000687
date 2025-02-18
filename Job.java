import java.util.*;

abstract class JobRole {
    String roleName;

    JobRole(String roleName) {
        this.roleName = roleName;
    }

    String getRoleName() {
        return roleName;
    }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {
    private T jobRole;

    Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    void displayResume() {
        System.out.println("Processing Resume for: " + jobRole.getRoleName());
    }

    static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            System.out.println("Screening: " + resume.getRoleName());
        }
    }
}

public class Job {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer());
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist());
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager());

        seResume.displayResume();
        dsResume.displayResume();
        pmResume.displayResume();

        List<JobRole> resumeList = List.of(new SoftwareEngineer(), new DataScientist(), new ProductManager());
        Resume.processResumes(resumeList);
    }
}