package Lesson5;

public class Dog extends Animal {

    public static int maxRunDistance = 500;
    public static int maxSwimDistance = 10;
    public static double maxJumpHeight = 0.5;


    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        distance = maxRunDistance;
        super.run(distance);
        System.out.println("The dog " + name + " ran " + randomRunNumber + " meters!");
    }

    @Override
    public void swim(int distance) {
        distance = maxSwimDistance;
        super.swim(distance);
        System.out.println("The dog " + name + " swam " + randomSwimNumber + " meters!");
    }

    @Override
    public void jump(double height) {
        height = maxJumpHeight;
        super.jump(height);
        System.out.println("The dog " + name + " jumped " + randomJumpNumber + " meters!");
    }
}
