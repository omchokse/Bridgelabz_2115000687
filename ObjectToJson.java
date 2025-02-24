import java.lang.reflect.*;
import java.util.*;

class Product {
    public String name = "Laptop";
    public int price = 1200;
}

public class ObjectToJson {
    public static String toJson(Object obj) throws Exception {
        Class<?> cls = obj.getClass();
        Map<String, Object> jsonMap = new HashMap<>();
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            jsonMap.put(field.getName(), field.get(obj));
        }
        return jsonMap.toString();
    }

    public static void main(String[] args) throws Exception {
        Product product = new Product();
        System.out.println("JSON: " + toJson(product));
    }
}
