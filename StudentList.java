class Student {
    int rollNo, age;
    String name, grade;
    Student next;

    Student(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentList {
    Student head;

    void addStudent(int rollNo, String name, int age, String grade) {
        Student newStudent = new Student(rollNo, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    void deleteStudent(int rollNo) {
        Student temp = head, prev = null;
        if (temp != null && temp.rollNo == rollNo) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.rollNo != rollNo) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null)
            return;
        prev.next = temp.next;
    }

    Student searchStudent(int rollNo) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    void updateGrade(int rollNo, String newGrade) {
        Student temp = searchStudent(rollNo);
        if (temp != null)
            temp.grade = newGrade;
    }

    void display() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }
}
