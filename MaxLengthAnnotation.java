import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(10)
    String username;

    User(String username) {
        if (username.length() > 10) {
            throw new IllegalArgumentException("Username exceeds max length!");
        }
        this.username = username;
    }
}

public class MaxLengthAnnotation {
    public static void main(String[] args) {
        new User("ShortName");
        new User("ThisNameIsTooLong");
    }
}