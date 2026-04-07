package package3;

public class Dog extends Animal {

    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int d) {
        if (d <= 500) {
            System.out.println(name + " пробежал " + d + " м.");
        } else {
            System.out.println(name + " не может пробежать " + d + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}