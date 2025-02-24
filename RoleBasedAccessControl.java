import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed {
    String value();
}

class SecureActions {
    @RoleAllowed("ADMIN")
    void deleteUser() {
        System.out.println("User deleted.");
    }
}

public class RoleBasedAccessControl {
    public static void main(String[] args) throws Exception {
        String currentUserRole = "USER";
        SecureActions actions = new SecureActions();

        Method method = SecureActions.class.getDeclaredMethod("deleteUser");
        method.setAccessible(true);

        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed role = method.getAnnotation(RoleAllowed.class);
            if (!role.value().equals(currentUserRole)) {
                System.out.println("Access Denied!");
                return;
            }
        }
        method.invoke(actions);
    }
}
