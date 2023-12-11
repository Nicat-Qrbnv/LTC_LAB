package lesson16.task3;

public class Person implements CanWalk, CanSwim {
    public Person() {
    }

    public void swim() {
        System.out.println("Walking person.");
    }

    public void walk() {
        System.out.println("Swimming person.");
    }
}
