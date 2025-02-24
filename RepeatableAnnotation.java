import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}

class Software {
    @BugReport(description = "UI glitch in dark mode")
    @BugReport(description = "Memory leak in cache system")
    void debug() {
    }
}

public class RepeatableAnnotation {
    public static void main(String[] args) throws Exception {
        Method method = Software.class.getMethod("debug");
        BugReports reports = method.getAnnotation(BugReports.class);
        for (BugReport report : reports.value()) {
            System.out.println("Bug: " + report.description());
        }
    }
}