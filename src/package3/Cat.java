package package3;

public class Cat extends Animal {

    private static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int d) {
        if (d <= 200) {
            System.out.println(name + " пробежал " + d + " м.");
        } else {
            System.out.println(name + " не может пробежать " + d + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public static int getCatCount() {
        return catCount;
    }
}