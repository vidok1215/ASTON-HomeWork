package Lesson7;

public class Cat extends Animal {
    private static int catCount = 0;
    public boolean fullness = false;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может преодолеть такое расстояние.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }

    public boolean eat(int foodAmount) {
        if (!fullness && foodAmount <= 10) {
            fullness = true;
            return true;
        }
        return false;
    }
}
