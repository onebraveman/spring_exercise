package io.github.onebraveman.lesson2;

import java.util.Map;

public class NewOneManBand implements Performer {
    public NewOneManBand() {
    }

    public void perform() {
        for (String k : instruments.keySet()) {
            System.out.println("Instrument:" + k + "\n");
            Instrument instrument = instruments.get(k);
            instrument.play();
        }
    }

    private Map<String, Instrument> instruments;
    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}
