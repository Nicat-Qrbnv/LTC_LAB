package lesson20.entrtnng;

public enum Direction {
    UP('w'),
    DOWN('s'),
    RIGHT('d'),
    LEFT('a');

    private final char value;

    private Direction(char value) {
        this.value = value;
    }

    public char getValue() {
        return this.value;
    }
}
