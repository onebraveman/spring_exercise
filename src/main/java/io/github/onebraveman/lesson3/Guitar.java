package io.github.onebraveman.lesson3;

import io.github.onebraveman.lesson2.Instrument;
import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {
    public void play() {
        System.out.println("Guitar start play.");
    }
}
