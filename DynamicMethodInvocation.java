import java.lang.reflect.*;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        MathOperations obj = new MathOperations();
        Class<?> cls = obj.getClass();
        Method method = cls.getMethod("add", int.class, int.class);
        System.out.println("Result: " + method.invoke(obj, 10, 5));
    }
}
