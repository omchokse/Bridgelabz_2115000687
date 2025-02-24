import java.lang.reflect.*;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}

class LoggingProxy {
    public static Object createProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("Invoked: " + method.getName());
                    return method.invoke(target, args);
                });
    }
}

public class DynamicProxyExample {
    public static void main(String[] args) {
        Greeting greeting = (Greeting) LoggingProxy.createProxy(new GreetingImpl());
        greeting.sayHello();
    }
}
