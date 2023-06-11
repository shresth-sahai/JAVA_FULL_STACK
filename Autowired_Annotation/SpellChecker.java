package looseVStightCoupling.Autowired_Annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SpellChecker {
    public SpellChecker(){
        System.out.println("contructor");
    }
    public void checkSpelling(){
        System.out.println("inside check spelling");
    }
}
// component----> 3 components --->
