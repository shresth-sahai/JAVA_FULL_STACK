package AnnotationEg;


import org.springframework.stereotype.Component;

@Component
public class Human {
    private String name;

    public Human(){
        this.name="John";
    }
    public  String getName(){
        return name;
    }
}
