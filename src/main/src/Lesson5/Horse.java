package Lesson5;

public class Horse extends Animal {

    public static int maxRunDistance = 1500;
    public static int maxSwimDistance = 100;
    public static double maxJumpHeight = 3.0;


    public Horse(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        distance = maxRunDistance;
        super.run(distance);
        System.out.println("The horse " + name + " ran " + randomRunNumber + " meters!");
    }

    @Override
    public void swim(int distance) {
        distance = maxSwimDistance;
        super.swim(distance);
        System.out.println("The horse " + name + " swam " + randomSwimNumber + " meters!");

    }

    @Override
    public void jump(double height) {
        height = maxJumpHeight;
        super.jump(height);
        System.out.println("The horse " + name + " jumped " + randomJumpNumber + " meters!");
    }
}
