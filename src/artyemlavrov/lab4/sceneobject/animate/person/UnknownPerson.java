package artyemlavrov.lab4.sceneobject.animate.person;

public class UnknownPerson extends Person {
    @Override
    public String getName() {
        return "Неизвестный";
    }

    @Override
    public String getAccusativeName() {
        return "Неизвестного";
    }

    @Override
    public String getDativeName() {
        return "Неизвестному";
    }
}
