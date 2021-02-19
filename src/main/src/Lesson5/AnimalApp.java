package Lesson5;

public class AnimalApp {

    public static void main(String[] args) {
        //Animal animal = new Animal("Bird");
        Bird bird = new Bird("Kesha");
        bird.run(bird.randomNumber);
        bird.swim(0);
        bird.jump(bird.maxJumpHeight);
        System.out.println("----------------------");
        Bird bird2 = new Bird("Birdy");
        bird2.run(bird2.randomRunNumber);
        bird2.swim(0);
        bird2.jump(bird.maxJumpHeight);

        System.out.println("----------------------");
        Horse horse = new Horse("Maxi");
        horse.run(horse.randomRunNumber);
        horse.swim(horse.randomSwimNumber);
        horse.jump(horse.randomJumpNumber);

        System.out.println("----------------------");
        Dog dog = new Dog("Rex");
        dog.run(dog.randomRunNumber);
        dog.swim(dog.randomSwimNumber);
        dog.jump(dog.randomJumpNumber);

        System.out.println("----------------------");
        Cat cat = new Cat("Puma");
        cat.run(cat.randomRunNumber);
        cat.swim(cat.randomSwimNumber);
        cat.jump(cat.randomJumpNumber);

    }
}
