import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {
}

class PerformanceTest {
    @LogExecutionTime
    void slowMethod() {
        long start = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++)
            ;
        long end = System.nanoTime();
        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}

public class LoggingMethod {
    public static void main(String[] args) {
        PerformanceTest test = new PerformanceTest();
        test.slowMethod();
    }
}