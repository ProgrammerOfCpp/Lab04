package artyemlavrov.lab4.sceneobject.inanimate;

public class Sausage extends Inanimate {
    @Override
    public String getInName() {
        return "в колбасу";
    }

    @Override
    public String getOutName() {
        return "из колбасы";
    }

    @Override
    public String getName() {
        return "колбаса";
    }

    @Override
    public String getAccusativeName() {
        return "колбасу";
    }

    @Override
    public String getDativeName() {
        return "колбасе";
    }
}
