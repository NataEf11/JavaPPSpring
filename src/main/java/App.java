import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 = applicationContext.getBean(HelloWorld.class);
        HelloWorld bean2 = applicationContext.getBean(HelloWorld.class);

        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);

        System.out.println("Cat = Cat: " + (cat1==cat2));
        System.out.println("HelloWorld = HelloWorld: " + (bean1==bean2));
    }
}