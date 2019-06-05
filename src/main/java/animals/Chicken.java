package animals;

import animals.abstractions.Bird;
import animals.interfaces.Swim;

public class Chicken extends Bird implements Swim {

    @Override
    public void peck() {
        System.out.println("Chicken hierarchy is called 'pecking order' therefore they sure can peck!");
    }

    @Override
    public void eat() {
        System.out.println("Chickens are omnivorous, they can eat anything from seeds to mice");
    }

    @Override
    public void makeSound() {
        System.out.println("Cluck, cluck");
    }

    @Override
    public void swim() {
        System.out.println("Chickens can swim for a short distance");
    }
}
