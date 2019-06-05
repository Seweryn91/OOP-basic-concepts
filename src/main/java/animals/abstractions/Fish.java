package animals.abstractions;

import animals.interfaces.Swim;

public abstract class Fish implements Swim {

    public void dive() {
        System.out.println(getClass().getSimpleName() + " can dive");
    }
}
