import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanHello =
                (HelloWorld) applicationContext.getBean("helloworld");


        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");

        System.out.println(beanHello == bean);
        System.out.println(beanCat == beanCat1);
    }
}