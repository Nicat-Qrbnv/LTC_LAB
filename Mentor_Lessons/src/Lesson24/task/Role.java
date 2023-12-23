package Lesson24.task;

import java.util.Comparator;

public class Role {
    private final String name;
    private final int minAge, maxAge;

    public Role(String name, int minAge, int maxAge) {
        this.name = name;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%-25s (%d - %d). Suitable actor: ".formatted(name, minAge, maxAge);
    }
}

class SortRolesByMinAge implements Comparator<Role> {
    @Override
    public int compare(Role r1, Role r2) {
        return Integer.compare(r1.getMinAge(), r2.getMinAge());
    }
}
