package looseVStightCoupling.Annotations_package.Primary;

import looseVStightCoupling.Annotations_package.Comp2.Example.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public  static void main(String[] args){

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        Shape shape=context.getBean(Shape.class); // shape class ko  Shape s=new Shape();

        System.out.println(shape.getName());//rectangle

        context.close();
    }
}
