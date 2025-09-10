import java.lang.reflect.*;
import java.util.*;

class Person2 {
    public String name;
    public int age;
}

public class Advanced_ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            try {
                Field field = clazz.getDeclaredField(entry.getKey());
                field.setAccessible(true);
                field.set(obj, entry.getValue());
            } catch (NoSuchFieldException e) {
                // ignore unknown fields
            }
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Alice");
        map.put("age", 28);

        Person2 p = toObject(Person2.class, map);
        System.out.println("Name: " + p.name + ", Age: " + p.age);
    }
}
