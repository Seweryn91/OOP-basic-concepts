package animals;

public abstract class Animal {

    private String name;
    private int weight;

    protected abstract void eat();
    protected abstract void drink();
    protected abstract void defecate();
    protected abstract void makeSound();
}
