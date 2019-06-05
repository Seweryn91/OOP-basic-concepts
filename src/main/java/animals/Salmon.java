package animals;

import animals.abstractions.Fish;
import animals.interfaces.Swim;

public class Salmon extends Fish implements Swim {


    public void swim() {
        System.out.println(getClass().getSimpleName() + " can swim in salt and fresh water");
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + " eats smaller fish as well as other animals");
    }

    @Override
    public void makeSound() {
        System.out.println("Some fish can make sound that is not audible to human ears");
    }
}