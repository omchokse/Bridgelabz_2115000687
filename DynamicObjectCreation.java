class Student {
    public Student() {
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Student");
        Object obj = cls.getDeclaredConstructor().newInstance();
        System.out.println("Object created: " + obj.getClass().getName());
    }
}
