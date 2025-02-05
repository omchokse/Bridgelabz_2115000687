import java.util.ArrayList;

class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        patients.add(patient);
        System.out.println(name + " is consulting " + patient.name);
    }
}

class Hospital {
    String name;
    ArrayList<Doctor> doctors;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");
        Doctor doctor1 = new Doctor("Dr. Wilson");
        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");

        doctor1.consult(patient1);
        doctor1.consult(patient2);
    }
}