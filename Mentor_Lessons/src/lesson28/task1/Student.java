package lesson28.task1;

import java.util.Objects;

public record Student(int id, String department, String name) {
    @Override
    public String toString() {
        return "%-30s: %-8s (ID: %04d).".formatted(department.concat(" department"), name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
