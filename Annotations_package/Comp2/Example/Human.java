package looseVStightCoupling.Annotations_package.Comp2.Example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {

    private Brain brain;

    @Autowired
    public Human (Brain brain){
        this.brain=brain;
    }
    public void think(){
        brain.processThoughts();
    }
}
