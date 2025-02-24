import java.lang.reflect.*;

class Configuration {
    private static String API_KEY = "DEFAULT_KEY";
}

public class ModifyStaticField {
    public static void main(String[] args) throws Exception {
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);
        System.out.println("Before: " + field.get(null));
        field.set(null, "NEW_API_KEY");
        System.out.println("After: " + field.get(null));
    }
}
