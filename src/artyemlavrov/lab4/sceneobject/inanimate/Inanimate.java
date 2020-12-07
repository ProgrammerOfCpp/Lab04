package artyemlavrov.lab4.sceneobject.inanimate;

import artyemlavrov.lab4.givinghandler.GivingHandler;
import artyemlavrov.lab4.givinghandler.inanimate.InanimateGivingHandler;
import artyemlavrov.lab4.sceneobject.SceneObject;

public abstract class Inanimate extends SceneObject {
    public abstract String getInName();

    public abstract String getOutName();

    @Override
    public GivingHandler getGivingHandler() {
        return new InanimateGivingHandler();
    }
}
