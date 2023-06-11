package looseVStightCoupling.Annotations_package.Primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Rectangle implements Shape{
    @Override
    public String getName(){
        return "Rectangle";
    }
}
