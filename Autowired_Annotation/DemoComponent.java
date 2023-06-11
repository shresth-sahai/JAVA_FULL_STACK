package looseVStightCoupling.Autowired_Annotation;

import org.springframework.stereotype.Component;
//class level annotation
@Component
public class DemoComponent {
    public  void demo(){
        System.out.println("Welocme");
    }
}
