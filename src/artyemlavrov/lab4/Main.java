package artyemlavrov.lab4;


import artyemlavrov.lab4.exceptions.IncorrectGivingException;
import artyemlavrov.lab4.exceptions.SausageFallsException;
import artyemlavrov.lab4.sceneobject.SceneObject;
import artyemlavrov.lab4.sceneobject.animate.person.Boy;

public class Main {
    public static void main(String[] args) {
        Scene mainScene = new Scene();
        Action prologue = new Action(Action -> {
            mainScene.stove.turnOn(mainScene.boy);
            System.out.println();
            mainScene.bottle.startHeating(mainScene.boy);
            System.out.println();
        });
        Action sleeping = new Action(Action -> {
            mainScene.birdy.fallAsleep();
            System.out.println();
            mainScene.birdy.printState();
            System.out.println();
            mainScene.carlson.sing();
            System.out.println();
            mainScene.bed.shake(mainScene.carlson);
            System.out.println();
        });
        prologue.setNext(sleeping);
        Action movingToCupboard = new Action(Action -> {
            mainScene.carlson.move(mainScene.cupboard);
            System.out.println();
            mainScene.cupboard.give(mainScene.carlson, mainScene.plate);
            System.out.println();
            mainScene.boy.look(new Boy.Look() {
                @Override
                public String getReason() {
                    return "от удивления";
                }

                @Override
                public String getCharacteristic() {
                    return "широко раскрыв глаза";
                }

                @Override
                public SceneObject getTaget() {
                    return mainScene.carlson;
                }
            });
            System.out.println();
        });
        sleeping.setNext(movingToCupboard);
        Action plot = new Action((Action action) -> {
            action.setHumorLevel(HumorLevel.VERY_FUN);
            mainScene.plate.give(mainScene.carlson, mainScene.sausage);
            System.out.println();
            try {
                mainScene.carlson.give(mainScene.birdy, mainScene.sausage);
            } catch (IncorrectGivingException e) {
                e.printStackTrace();
            }
            System.out.println("Это " + action.getHumorLevelString() + ".");
            System.out.println();
        });
        movingToCupboard.setNext(plot);
        Action epilogue = new Action(Action -> {
            mainScene.boy.say("Эээ...");
            System.out.println();
            try {
                mainScene.carlson.shakeSasuage(mainScene.sausage, mainScene.birdy);
            } catch (SausageFallsException e) {
                e.printStackTrace();
            }
            System.out.println();
            mainScene.unknownPerson.move(mainScene.stairs);
            System.out.println();
            mainScene.boy.jumpFromScare();
        });
        plot.setNext(epilogue);
        Action alternativePlot = new Action((Action action) -> {
            action.setHumorLevel(HumorLevel.VERY_FUN);
            Scene imaginativeScene = new Scene();
            imaginativeScene.plate.give(imaginativeScene.birdy, imaginativeScene.sausage);
            System.out.print(" ");
            imaginativeScene.birdy.fallAsleep();
            System.out.print(" Это тоже " + action.getHumorLevelString());
        });
        plot.setSimilar(alternativePlot);
        prologue.perform();
    }
}