import java.lang.reflect.*;

class Student {
    public String name;
    public Student() {
        this.name = "Default Student";
    }
}

public class Basic_DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Student");
        Object obj = clazz.getDeclaredConstructor().newInstance();
        Field field = clazz.getDeclaredField("name");
        System.out.println("Created Student with name: " + field.get(obj));
    }
}
