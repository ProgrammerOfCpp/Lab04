package artyemlavrov.lab4.givinghandler.inanimate;

import artyemlavrov.lab4.givinghandler.GivingHandler;
import artyemlavrov.lab4.sceneobject.SceneObject;
import artyemlavrov.lab4.sceneobject.inanimate.Inanimate;

public class InanimateGivingHandler implements GivingHandler {
    @Override
    public boolean handle(SceneObject from, SceneObject to, SceneObject item) {
        if (to instanceof Inanimate) {
            System.out.printf("%s не может передать предмет %s, так как они оба являются неодушевлёнными.", from.getName(), to.getDativeName());
            return false;
        }
        System.out.printf("%s забирает %s %s.", to.getName(), item.getAccusativeName(), ((Inanimate)from).getOutName());
        return true;
    }
}
