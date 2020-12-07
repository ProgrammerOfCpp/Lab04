package artyemlavrov.lab4.sceneobject.animate.person;

import artyemlavrov.lab4.sceneobject.SceneObject;

public class Boy extends Person {

    public static abstract class Look {
        public abstract String getReason();
        public abstract String getCharacteristic();
        public abstract SceneObject getTaget();
    }

    @Override
    public String getName() {
        return "Малыш";
    }

    @Override
    public String getAccusativeName() {
        return "Малыша";
    }

    @Override
    public String getDativeName() {
        return "Малышу";
    }

    @Override
    public boolean isMale() {
        return true;
    }

    public void look(Look look) {
        System.out.print(getName() +
                " смотрит на " + look.getTaget().getAccusativeName() +
                " " + look.getCharacteristic() +
                " " + look.getReason() + ".");
    }

    public void jumpFromScare() {
        System.out.print(getName() + " подскочил от испуга.");
    }
}
