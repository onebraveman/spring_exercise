package io.github.onebraveman.lesson3;

import io.github.onebraveman.lesson2.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson3/autowiring.xml");

        // byName autowiring
        System.out.println("***" + "byName autowiring" + "***");
        Instrumentalist kenny = (Instrumentalist) context.getBean("kenny");
        kenny.perform();

        // byType autowiring
        System.out.println("***" + "byType autowiring" + "***");
        Instrumentalist kenny2 = (Instrumentalist) context.getBean("kenny2");
        kenny2.perform();

        System.out.println("***" + "constructor autowiring" + "***");
        Performer poeticjuggle = (Performer) context.getBean("poeticjuggle");
        poeticjuggle.perform();

        Performer performer = (Performer) context.getBean("xml_kenny");
        performer.perform();
    }
}
