package looseVStightCoupling.Annotations_package;


import org.springframework.stereotype.Component;

// @component --> is used via a class for autodetection Spring Managed Component
@Component
public class ComponentExample {
    public  void doSomething(){
        System.out.println("Doing something in eg component");
    }
}
