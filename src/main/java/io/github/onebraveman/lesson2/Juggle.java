package io.github.onebraveman.lesson2;

public class Juggle implements Performer {
    private int beanBags;

    public Juggle(int beanBags) {
        this.beanBags = beanBags;
    }

    public Juggle() {
        this.beanBags = 3;
    }

    public void perform() {
        System.out.println("JUGGLEING " + beanBags + " BEANBAGS");
    }
}
