package animals;

import animals.abstractions.Bird;
import animals.interfaces.Dive;
import animals.interfaces.Swim;

public class Penguin extends Bird implements Swim, Dive {
    @Override
    public void peck() {
        System.out.println(getClass().getSimpleName() + " can peck");
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + " eats fish");
    }

    @Override
    public void makeSound() {
        System.out.println(getClass().getSimpleName() + " bray like a donkey");

    }

    @Override
    public void dive() {
        System.out.println(getClass().getSimpleName() + " dives to catch fish");
    }

    @Override
    public void swim() {
        System.out.println(getClass().getSimpleName() + " also swims, but cannot fly");
    }
}
