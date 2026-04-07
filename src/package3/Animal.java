package package3;

public abstract class Animal {

    protected String name;
    protected static int count = 0;
    public Animal(String name) {
        this.name = name;
        count++;
    }
    public abstract void run(int d);
    public abstract void swim(int d);

    public static int getAnimalCount() {
        return count;
    }
}
