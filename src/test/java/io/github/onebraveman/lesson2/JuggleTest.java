package io.github.onebraveman.lesson2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/** Basic spring xml setting */
public class JuggleTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("juggle.xml");
        Auditorium auditorium = (Auditorium)context.getBean("auditorium");
        Stage stage = (Stage) context.getBean("stage");
        System.out.println(stage);

        Juggle juggle = (Juggle)context.getBean("poeticjuggle");
        juggle.perform();

        Instrumentalist instrumentalist = (Instrumentalist) context.getBean("instrumentalist");
        instrumentalist.perform();
        Instrumentalist kenny = (Instrumentalist) context.getBean("kenny");
        kenny.perform();

        // OneManBand
        System.out.println("hack start perform.");
        Performer performer = (Performer) context.getBean("hack");
        performer.perform();

        // NewOneManBand
        System.out.println("newhack start perform");
        performer = (Performer) context.getBean("newhack");
        performer.perform();
    }
}
