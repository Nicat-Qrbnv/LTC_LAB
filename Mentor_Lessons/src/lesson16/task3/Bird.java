package lesson16.task3;

public class Bird implements CanFly, CanWalk, CanSwim {
    public Bird() {
    }

    public void fly() {
        System.out.println("Flying bird.");
    }

    public void swim() {
        System.out.println("Swimming bird.");
    }

    public void walk() {
        System.out.println("Walking bird.");
    }
}
