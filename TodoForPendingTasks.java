import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();

    String assignedTo();

    String priority() default "MEDIUM";
}

class Project {
    @Todo(task = "Implement authentication", assignedTo = "Harsh", priority = "HIGH")
    void authFeature() {
    }

    @Todo(task = "Optimize database queries", assignedTo = "Om")
    void optimizeDB() {
    }
}

public class TodoForPendingTasks {
    public static void main(String[] args) {
        Method[] methods = Project.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);
                System.out.println("Task: " + annotation.task() + ", Assigned To: " + annotation.assignedTo()
                        + ", Priority: " + annotation.priority());
            }
        }
    }
}