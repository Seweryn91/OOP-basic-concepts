package animals;

import animals.abstractions.Bird;
import animals.interfaces.Fly;

public class Ara extends Bird implements Fly {
    @Override
    public void peck() {
        System.out.println(getClass().getSimpleName() + " can peck painfully");
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + " eats different parts of plants");
    }

    @Override
    public void makeSound() {
        System.out.println(getClass().getSimpleName() + " is very loud");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is excellent skydiver");
    }
}
