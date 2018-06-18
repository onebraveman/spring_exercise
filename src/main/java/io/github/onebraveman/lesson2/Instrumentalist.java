package io.github.onebraveman.lesson2;

public class Instrumentalist {
    public Instrumentalist() {}

    public void perform() {
        System.out.println("Playing " + song + ":");
        instrument.play();
    }

    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    private Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
