package artyemlavrov.lab4.givinghandler;

import artyemlavrov.lab4.sceneobject.SceneObject;

public interface GivingHandler {
    boolean handle(SceneObject from, SceneObject to, SceneObject item);
}
