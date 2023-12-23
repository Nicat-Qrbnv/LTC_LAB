package Lesson24.task;

import java.util.Comparator;

public class Actor {
    private final String name;
    private final int age, actingSkill;
    private boolean hasRole;

    public Actor(String name, int age, int actingSkill) {
        this.name = name;
        this.age = age;
        this.actingSkill = actingSkill;
    }

    public int getActingSkill() {
        return actingSkill;
    }

    public boolean isHasRole() {
        return hasRole;
    }

    public void setHasRole(boolean hasRole) {
        this.hasRole = hasRole;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "%s (%d), acting skill: %d".formatted(name, age, actingSkill);
    }
}

class SortActorsByActingSkill implements Comparator<Actor> {
    @Override
    public int compare(Actor a1, Actor a2) {
        return Integer.compare(a1.getActingSkill(), a2.getActingSkill());
    }
}
