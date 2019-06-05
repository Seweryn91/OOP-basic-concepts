package animals.abstractions;

public abstract class Animal {

    private String name = "";
    private float weight = 0;

    public abstract void eat();
    public abstract void makeSound();

    public void drink() {
        System.out.println("Slurp!");
    }

    public void defecate() {
        System.out.println("Plop!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
