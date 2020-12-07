package artyemlavrov.lab4.sceneobject.inanimate;

public class Plate extends Inanimate {
    @Override
    public String getInName() {
        return "в тарелку";
    }

    @Override
    public String getOutName() {
        return "из тарелки";
    }

    @Override
    public String getName() {
        return "тарелка";
    }

    @Override
    public String getAccusativeName() {
        return "тарелку";
    }

    @Override
    public String getDativeName() {
        return "тарелке";
    }
}
