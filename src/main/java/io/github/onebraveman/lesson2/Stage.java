package io.github.onebraveman.lesson2;

public class Stage {
    private Stage() {}

    private static class StageSignletonHolder {
        static Stage stage = new Stage();
    }

    public static Stage getInstance() {
        return StageSignletonHolder.stage;
    }

    @Override
    public String toString() {
        return "Stage";
    }
}
