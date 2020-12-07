package artyemlavrov.lab4.sceneobject.inanimate;

import artyemlavrov.lab4.sceneobject.animate.Animate;

public class Bed extends Inanimate {

    public void shake(Animate operator) {
        System.out.print(operator.getName() + " трясёт кроватку.");
    }

    @Override
    public String getName() {
        return "кроват";
    }

    @Override
    public String getAccusativeName() {
        return "кроватку";
    }

    @Override
    public String getDativeName() {
        return "кроватке";
    }

    @Override
    public String getInName() {
        return "в кроватку";
    }

    @Override
    public String getOutName() {
        return "из кроватки";
    }
}
