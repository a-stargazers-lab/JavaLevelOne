package Lesson5;

public class Cat extends Animal {

    public static int maxRunDistance = 200;
    public static int maxSwimDistance = 0;
    public static double maxJumpHeight = 2.0;


    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        distance = maxRunDistance;
        super.run(distance);
        System.out.println("The cat " + name + " ran " + randomRunNumber + " meters!");
    }

    @Override
    public void swim(int distance) {
        distance = maxSwimDistance;
        //super.swim(distance);
        System.out.println("A cat cannot swim!");
    }

    @Override
    public void jump(double height) {
        height = maxJumpHeight;
        super.jump(height);
        System.out.println("The cat " + name + " jumped " + randomJumpNumber + " meters!");
    }
}
