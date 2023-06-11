package looseVStightCoupling.Annotations_package.Autowired_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Autowired ---> dependency inject (inject dependencies into a class or container
@Component
public class ExampleClass {

    private Dependency dependency;

    @Autowired
    public ExampleClass(Dependency dependency){
        this.dependency=dependency;
    }
    // rest of the code
    public void execute(){
        dependency.doSomething();
    }

    public void doSomething() {
    }
}
