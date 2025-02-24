import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Example {
    @ImportantMethod(level = "HIGH")
    void criticalFunction() {
    }

    @ImportantMethod(level = "MEDIUM")
    void secondaryFunction() {
    }
}

public class MarkImportantMethods {
    public static void main(String[] args) {
        Method[] methods = Example.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Level: " + annotation.level());
            }
        }
    }
}