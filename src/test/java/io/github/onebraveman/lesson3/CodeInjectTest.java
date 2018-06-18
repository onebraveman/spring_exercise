package io.github.onebraveman.lesson3;

import io.github.onebraveman.lesson2.Instrument;
import io.github.onebraveman.lesson2.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CodeInjectTest {
    void TestCodeInject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson3/codeinject.xml");

        Instrumentalist performer = (Instrumentalist) context.getBean("xml_kenny");
        performer.perform();
    }

    void TestAutoDetect() {
        ApplicationContext context = new ClassPathXmlApplicationContext("lesson3/autodetect.xml");

        Instrument instrument = (Instrument) context.getBean("guitar");
        instrument.play();
        Performer performer = (Performer) context.getBean("jack");
        performer.perform();
    }

    public static void main(String[] args) {
        CodeInjectTest codeInjectTest = new CodeInjectTest();
        codeInjectTest.TestAutoDetect();
    }
}
