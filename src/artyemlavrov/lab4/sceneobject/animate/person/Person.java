package artyemlavrov.lab4.sceneobject.animate.person;

import artyemlavrov.lab4.sceneobject.animate.Animate;

public abstract class Person extends Animate {

    public void say(String text) {
        System.out.printf("%s сказал: \"%s\"", getName(), text);
    }

    @Override
    public boolean isMale() {
        return true;
    }
}
