package artyemlavrov.lab4.sceneobject;

import artyemlavrov.lab4.exceptions.IncorrectGivingException;
import artyemlavrov.lab4.givinghandler.GivingHandler;

import java.util.LinkedList;
import java.util.Objects;

public abstract class SceneObject {
    private SceneObject location = null;
    private final LinkedList<SceneObject> container = new LinkedList<>();

    public SceneObject() {

    }

    public abstract String getName();

    public abstract String getAccusativeName();

    public abstract String getDativeName();

    public abstract GivingHandler getGivingHandler();

    public void move(SceneObject to) {
        this.location = to;
        System.out.printf("%s перемещается к %s.", getName(), to.getDativeName());
    }

    public void give(SceneObject to, SceneObject item) throws IncorrectGivingException {
        if (to == null)
            throw new IncorrectGivingException("Error: giving to null!");
        if (item == null)
            throw new IncorrectGivingException("Error: giving a null!");
        if (!container.contains(item))
            throw new IncorrectGivingException("Error: giving item not present in inventory!");
        if (to == this)
            throw new IncorrectGivingException("Error: giving to yourself!");

        GivingHandler givingHandler = getGivingHandler();
        if (givingHandler.handle(this, to, item)) {
            container.remove(item);
            to.container.add(item);
        }
    }

    public void put(SceneObject item) {
        container.add(item);
    }

    @Override
    public String toString() {
        return "SceneObject{" +
                "location=" + location +
                ", container=" + container +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SceneObject)) return false;
        SceneObject that = (SceneObject) o;
        return Objects.equals(location, that.location) &&
                Objects.equals(container, that.container);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, container);
    }
}
