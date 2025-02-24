import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name();
}

class User {
    @JsonField(name = "user_name")
    String username = "Om Chokse";

    @JsonField(name = "user_age")
    int age = 21;
}

public class CustomSerialization {
    public static void main(String[] args) throws Exception {
        User user = new User();
        Field[] fields = User.class.getDeclaredFields();
        System.out.print("{ ");
        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                System.out.print("\"" + annotation.name() + "\": \"" + field.get(user) + "\", ");
            }
        }
        System.out.println("}");
    }
}