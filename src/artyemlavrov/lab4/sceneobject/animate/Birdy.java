package artyemlavrov.lab4.sceneobject.animate;

import java.util.Objects;

public class Birdy extends Animate {

    private boolean isSleeping = false;

    @Override
    public String getName() {
        return "Гюль-фия";
    }

    @Override
    public String getAccusativeName() {
        return "Гюль-фию";
    }

    @Override
    public String getDativeName() {
        return "Гюль-фии";
    }

    @Override
    public boolean isMale() {
        return false;
    }

    public void fallAsleep() {
        if (!isSleeping()) {
            System.out.printf("%s засыпает.", this.getName());
            isSleeping = true;
        }
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    @Override
    public String toString() {
        return "Birdy{" +
                "isSleeping=" + isSleeping +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birdy birdy = (Birdy) o;
        return isSleeping == birdy.isSleeping;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isSleeping);
    }
}
