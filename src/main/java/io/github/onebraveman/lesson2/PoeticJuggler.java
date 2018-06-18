package io.github.onebraveman.lesson2;

public class PoeticJuggler extends Juggle {
    private Poem poem;

    public PoeticJuggler(Poem poem) {
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public void perform() {
        super.perform();
        System.out.println("while reciting...");
        poem.recite();
    }
}
