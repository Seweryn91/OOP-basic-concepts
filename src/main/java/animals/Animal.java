package animals;

public abstract class Animal {

    private String name;
    private int weight;

    protected abstract void eat();
    protected abstract void makeSound();

    protected void drink() {
        System.out.println("Slurp!");
    }
    
    protected void defecate() {
        System.out.println("Plop!");
    }
}
