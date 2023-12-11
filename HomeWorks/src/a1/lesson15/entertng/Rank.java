package a1.lesson15.entertng;

import java.util.Objects;

public class Rank {
    private final String name;
    private final int weight;

    public Rank(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rank rank)) return false;
        return weight == rank.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }
}
