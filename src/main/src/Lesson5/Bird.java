package Lesson5;

import java.util.Random;

public class Bird extends Animal {

    private final Random rnd = new Random();

    public final int maxRunDistance =5;                      //5;
    public final int maxSwimDistance = 0;
    public final double maxJumpHeight = 0.2;

    public int randomNumber;



    public Bird(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        distance = maxRunDistance;
        super.run(distance);
        System.out.println("The bird " + name + " ran " + randomRunNumber + " meters!");
    }

    @Override
    public void swim(int distance) {
        distance = maxSwimDistance;
        System.out.println("A bird cannot swim!");
        //super.swim(distance);
    }

    @Override
    public void jump(double height) {
        height = maxJumpHeight;
        super.jump(height);
        System.out.println("The bird " + name + " jumped " + randomJumpNumber + " meters!");
    }
}
