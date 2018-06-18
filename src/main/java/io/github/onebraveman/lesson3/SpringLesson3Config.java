package io.github.onebraveman.lesson3;

import io.github.onebraveman.lesson2.Performer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringLesson3Config {
    // bean declaration
    public Performer instrumentalist() {
        return  new Instrumentalist();
    }
}
