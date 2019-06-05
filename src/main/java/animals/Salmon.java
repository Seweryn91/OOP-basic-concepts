package animals;

import animals.abstractions.Fish;
import animals.interfaces.Swim;

public class Salmon extends Fish implements Swim {


    public void swim() {
        System.out.println(getClass().getSimpleName() + " can swim in salt and fresh water");
    }
}