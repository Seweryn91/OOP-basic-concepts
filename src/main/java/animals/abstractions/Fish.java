package animals.abstractions;

import animals.interfaces.Swim;

public abstract class Fish extends Animal implements Swim {

    public void dive() {
        System.out.println(getClass().getSimpleName() + " can dive");
    }
}
