package artyemlavrov.lab4.sceneobject.inanimate;

public class Table extends Inanimate {
    @Override
    public String getInName() {
        return "на стол";
    }

    @Override
    public String getOutName() {
        return "со стола";
    }

    @Override
    public String getName() {
        return "cтол";
    }

    @Override
    public String getAccusativeName() {
        return "стол";
    }

    @Override
    public String getDativeName() {
        return "столу";
    }
}
