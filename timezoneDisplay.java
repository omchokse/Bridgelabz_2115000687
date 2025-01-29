import java.time.ZonedDateTime;
import java.time.ZoneId;

public class timezoneDisplay {
    public static void main(String[] args) {
        displayTime("GMT");
        displayTime("Asia/Kolkata");
        displayTime("America/Los_Angeles");
    }

    public static void displayTime(String zone) {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zone));
        System.out.println("Current time in " + zone + ": " + time);
    }
}
