package artyemlavrov.lab4.sceneobject.animate.person;

import artyemlavrov.lab4.exceptions.SausageFallsException;
import artyemlavrov.lab4.givinghandler.GivingHandler;
import artyemlavrov.lab4.givinghandler.animate.CarlsonGivingHandler;
import artyemlavrov.lab4.sceneobject.animate.Birdy;
import artyemlavrov.lab4.sceneobject.inanimate.Sausage;

public class Carlson extends Person {
    @Override
    public String getName() {
        return "Карлсон";
    }

    @Override
    public String getAccusativeName() {
        return "Карлсона";
    }

    @Override
    public String getDativeName() {
        return "Карлсону";
    }

    @Override
    public GivingHandler getGivingHandler() {
        return new CarlsonGivingHandler();
    }

    public void sing() {
        System.out.print(getName() + " громко поёт.");
    }

    public void shakeSasuage(Sausage sausage, Birdy birdy) throws SausageFallsException {
        System.out.println(getName() + " проверяет, прочно ли " + sausage.getName() + " держится в клюве.");
        if (birdy.isSleeping() && birdy.isTheBestState()) {
            System.out.print("*Прочно...*");
        } else {
            throw new SausageFallsException("Сосиска выпала!");
        }
    }

    @Override
    public boolean isMale() {
        return true;
    }
}
