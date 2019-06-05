package animals;

import animals.abstractions.Amphibian;
import animals.interfaces.Swim;
import animals.interfaces.Dive;


public class Frog extends Amphibian implements Swim, Dive {

    @Override
    public void metamorph() {
        System.out.println(getClass().getSimpleName() + " morphs from tadpole to frog");
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + " eats insects and other invertebrates");
    }

    @Override
    public void makeSound() {
        System.out.println(getClass().getSimpleName() + " Chortles. Croak, croak!");
    }

    @Override
    public void swim() {
        System.out.println(getClass().getSimpleName() + " swims very well");
    }

    @Override
    public void dive() {
        System.out.println(getClass().getSimpleName() + " is born diver");
    }
}
