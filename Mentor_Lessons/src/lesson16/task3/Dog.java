package lesson16.task3;

public class Dog implements CanWalk, CanSwim {
    public Dog() {
    }

    public void swim() {
        System.out.println("Swimming dog.");
    }

    public void walk() {
        System.out.println("Walking dog.");
    }
}
