package lesson20.normal;

import java.util.ArrayList;
import java.util.List;

public class Pair <T> {

    private T value1;
    private T value2;

    public Pair(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public List<? super Number> getPair() {
        List<? super Number> p = new ArrayList<>(List.of(value1, value2));
        return p;
    }

    public T getValue2() {
        return value2;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }
}
