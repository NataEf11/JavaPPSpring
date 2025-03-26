package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Say:" + animal.toString());
        System.out.println("At:" + new Timer().getTime());
        System.out.println("At:" + timer.getTime());
        System.out.println("________________________");
    }
    public Timer getTimer() {
        return timer;
    }
}