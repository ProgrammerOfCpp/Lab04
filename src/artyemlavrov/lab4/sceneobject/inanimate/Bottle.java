package artyemlavrov.lab4.sceneobject.inanimate;

import artyemlavrov.lab4.sceneobject.animate.Animate;

public class Bottle extends Inanimate {
    @Override
    public String getInName() {
        return "в бутылочку";
    }

    @Override
    public String getOutName() {
        return "из бутылочки";
    }

    @Override
    public String getName() {
        return "бутылочка";
    }

    @Override
    public String getAccusativeName() {
        return "бутылочку";
    }

    @Override
    public String getDativeName() {
        return "бутылочке";
    }

    public void startHeating(Animate operator) {
        System.out.print(operator.getName() + " начинает греть бутылочку.");
    }
}
