package AnnotationEg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalSoundPlayer {

    private Animal animal;
    @Autowired
    public AnimalSoundPlayer(Animal animal){
        this.animal=animal;
    }
    public void playSound(){
        animal.sound();
    }

}
