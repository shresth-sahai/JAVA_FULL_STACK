package looseVStightCoupling.Annotations_package.Primary;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape{

    @Override
    public String getName(){
        return "Square";
    }
}
