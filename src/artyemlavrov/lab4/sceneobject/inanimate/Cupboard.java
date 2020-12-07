package artyemlavrov.lab4.sceneobject.inanimate;

public class Cupboard extends Inanimate {
    @Override
    public String getInName() {
        return "в шкаф";
    }

    @Override
    public String getOutName() {
        return "из шкафа";
    }

    @Override
    public String getName() {
        return "шкафу";
    }

    @Override
    public String getAccusativeName() {
        return "шкаф";
    }

    @Override
    public String getDativeName() {
        return "шкафу";
    }
}
