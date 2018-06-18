package io.github.onebraveman.lesson3;

import io.github.onebraveman.lesson2.Instrument;
import io.github.onebraveman.lesson2.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("jack")
public class Instrumentalist implements Performer {
    public Instrumentalist() {}

    public void perform() {
        System.out.println("io.github.onebraveman.lesson3 Playing " + song + ":");
        instrument.play();
    }

    @Autowired(required = false)
    @Value("解脱")
    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Autowired(required = false)
    @Qualifier("stringed")
//    @Qualifier("piano")
    private Instrument instrument;
}
