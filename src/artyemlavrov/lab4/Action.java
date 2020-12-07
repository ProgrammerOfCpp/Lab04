package artyemlavrov.lab4;

import artyemlavrov.lab4.actionhandler.ActionHandler;

import java.util.Objects;

public class Action {
    private Action similar = null;
    private Action next = null;
    private final ActionHandler actionHandler;
    private HumorLevel humorLevel = HumorLevel.NOT_FUN;

    public Action(ActionHandler eventHandler) {
        this.actionHandler = eventHandler;
    }

    public void perform() {
        this.actionHandler.handle(this);
        if (similar != null) {
            System.out.print("Это похоже на следующую ситуацию: «");
            this.similar.perform();
            System.out.println("»");
        }
        if (next != null) {
            System.out.println();
            this.next.perform();
        }
    }

    public void setSimilar(Action similar) {
        this.similar = similar;
    }

    public void setNext(Action next) {
        this.next = next;
    }

    public void setHumorLevel(HumorLevel humorLevel) {
        this.humorLevel = humorLevel;
    }

    public String getHumorLevelString() {
        switch (humorLevel) {
            case NOT_FUN: return "не смешно";
            case FUN: return "смешно";
            case VERY_FUN: return "очень смешно";
        }
        return null;
    }

    @Override
    public String toString() {
        return "Action{" +
                "similar=" + similar +
                ", next=" + next +
                ", actionHandler=" + actionHandler +
                ", humorLevel=" + humorLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Action)) return false;
        Action action = (Action) o;
        return Objects.equals(similar, action.similar) &&
                Objects.equals(next, action.next) &&
                Objects.equals(actionHandler, action.actionHandler) &&
                humorLevel == action.humorLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(similar, next, actionHandler, humorLevel);
    }
}
