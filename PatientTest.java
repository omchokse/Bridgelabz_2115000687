abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age + ", Bill: " + calculateBill());
    }
}

class InPatient extends Patient {
    private double dailyCharge;
    private int daysAdmitted;

    public InPatient(String patientId, String name, int age, double dailyCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
    }

    public double calculateBill() {
        return dailyCharge * daysAdmitted;
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }
}

interface MedicalRecord {
    void addRecord(String record);

    String viewRecords();
}

class PatientTest {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P101", "John Doe", 45, 2000, 5);
        Patient p2 = new OutPatient("P102", "Jane Smith", 30, 500);

        p1.getPatientDetails();
        p2.getPatientDetails();
    }
}