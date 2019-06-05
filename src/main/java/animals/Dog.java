package animals;

import animals.abstractions.Mammal;
import animals.interfaces.Swim;

public class Dog extends Mammal implements Swim {

    private String name;
    private int weight;

    @Override
    public void drinkMilk() {
        super.drinkMilk();
    }

    @Override
    public void eat() {
        System.out.println("Cromch, cromch! Om nom nom!");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    @Override
    public void swim() {
        System.out.println(getClass().getSimpleName() +" likes to swim");
    }
}