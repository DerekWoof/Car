package Cars;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfid.class);
        Car car = (Car)context.getBean("car");
        car.buy();
        car.buySecond();
    }
}
