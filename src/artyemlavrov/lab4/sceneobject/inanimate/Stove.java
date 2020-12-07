package artyemlavrov.lab4.sceneobject.inanimate;

import artyemlavrov.lab4.sceneobject.animate.Animate;

public class Stove extends Inanimate {
    @Override
    public String getInName() {
        return "на плитку";
    }

    @Override
    public String getOutName() {
        return "c плитки";
    }

    @Override
    public String getName() {
        return "плитка";
    }

    @Override
    public String getAccusativeName() {
        return "плитку";
    }

    @Override
    public String getDativeName() {
        return "плитке";
    }

    public void turnOn(Animate operator) {
        System.out.print(operator.getName() + " включил плитку.");
    }
}
