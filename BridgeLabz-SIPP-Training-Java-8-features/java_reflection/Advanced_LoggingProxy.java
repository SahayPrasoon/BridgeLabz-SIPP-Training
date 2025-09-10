import java.lang.reflect.*;

interface Greeting {
    void sayHello();
}

class GreetingImpl implements Greeting {
    public void sayHello() {
        System.out.println("Hello World!");
    }
}

class LoggingHandler implements InvocationHandler {
    private Object target;
    public LoggingHandler(Object target) {
        this.target = target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Invoking method: " + method.getName());
        return method.invoke(target, args);
    }
}

public class Advanced_LoggingProxy {
    public static void main(String[] args) {
        GreetingImpl real = new GreetingImpl();
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
            Greeting.class.getClassLoader(),
            new Class[]{Greeting.class},
            new LoggingHandler(real)
        );
        proxy.sayHello();
    }
}
