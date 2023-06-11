package AnnotationEg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static  void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        AnimalSoundPlayer animalSoundPlayer=context.getBean(AnimalSoundPlayer.class);

        Human human=context.getBean(Human.class);

        System.out.println(human.getName());

        context.close();

    }
}
