import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {
}

class Service {
    void serve() {
        System.out.println("Service is running");
    }
}

class Client {
    @Inject
    private Service service;

    void execute() {
        service.serve();
    }
}

public class DependencyInjection {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        for (Field field : client.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(client, new Service());
            }
        }
        client.execute();
    }
}
