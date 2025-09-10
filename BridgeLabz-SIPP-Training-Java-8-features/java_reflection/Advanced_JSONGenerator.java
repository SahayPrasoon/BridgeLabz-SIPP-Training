import java.lang.reflect.*;

class Employee {
    public String name = "Bob";
    public int salary = 50000;
}

public class Advanced_JSONGenerator {
    public static String toJson(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();
        StringBuilder sb = new StringBuilder("{");
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            sb.append("\"").append(fields[i].getName()).append("\": \"").append(fields[i].get(obj)).append("\"");
            if (i < fields.length - 1) sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        Employee emp = new Employee();
        System.out.println(toJson(emp));
    }
}
