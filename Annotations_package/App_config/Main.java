package looseVStightCoupling.Annotations_package.App_config;

import looseVStightCoupling.Annotations_package.Comp2.Example.AppConfig;
import looseVStightCoupling.Annotations_package.Primary.Shape;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public  static void main(String[] args){

    AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

    AnnotationConfigApplicationContext context1=new AnnotationConfigApplicationContext(AppConfig_2.class);
   HelloWorld helloWorld=context.getBean(HelloWorld.class);

   Human human= context1.getBean(Human.class);
   human.intro();//hi john 25

   helloWorld.sayHello(); //hello world

        context.close();
}
}
