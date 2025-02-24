import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.HashMap;

@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult {
}

class ExpensiveOperation {
    static HashMap<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    int square(int num) {
        if (cache.containsKey(num)) {
            System.out.println("Returning cached value.");
            return cache.get(num);
        }
        int result = num * num;
        cache.put(num, result);
        return result;
    }
}

public class CustomCachingSystem {
    public static void main(String[] args) {
        ExpensiveOperation operation = new ExpensiveOperation();
        System.out.println(operation.square(4));
        System.out.println(operation.square(4));
    }
}