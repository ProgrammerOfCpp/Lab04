package artyemlavrov.lab4.sceneobject.animate;

import artyemlavrov.lab4.givinghandler.GivingHandler;
import artyemlavrov.lab4.givinghandler.animate.AnimateGivingHandler;
import artyemlavrov.lab4.sceneobject.SceneObject;

import java.util.Objects;

public abstract class Animate extends SceneObject {

    private State state = new State();

    private class State {
        boolean hungry = false;
        boolean happy = true;

        State() {}

        State(boolean hungry, boolean happy) {
            this.happy = happy;
            this.hungry = hungry;
        }

        @Override
        public String toString() {
            return "State{" +
                    "hungry=" + hungry +
                    ", happy=" + happy +
                    '}';
        }

        boolean isTheBest() {
            return !hungry && happy;
        }

        void print() {
            class PrintInfo {
                String printString;

                PrintInfo() {
                    String hungriness;
                    if (state.hungry) {
                        hungriness = "голод" + (isMale() ? "ен" : "на");
                    } else {
                        hungriness = "сыт" + (isMale() ? "" : "а");
                    }
                    String happiness = (state.happy ? "довол" : "недовол") + (isMale() ? "ен" : "ьна");
                    printString = String.format("%s %s и %s.", getName(), happiness, hungriness);
                }

                public String getPrintString() {
                    return printString;
                }
            }
            System.out.print(new PrintInfo().getPrintString());
        }
    }

    public void setState(boolean hungry, boolean happy) {
        this.state = new State(hungry, happy);
    }

    public boolean isTheBestState() { return this.state.isTheBest(); }

    public void printState() {
        this.state.print();
    }

    public abstract boolean isMale();

    @Override
    public GivingHandler getGivingHandler() {
        return new AnimateGivingHandler();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Animate animate = (Animate) o;
        return Objects.equals(state, animate.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), state);
    }

    @Override
    public String toString() {
        return "Animate{" +
                "state=" + state +
                '}';
    }
}
