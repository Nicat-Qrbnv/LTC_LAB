package prjcts.p6_cardDeck;

public enum Suit {
    CLUB((char) 9827),
    DIAMOND((char) 9830),
    HEART((char) 9829),
    SPADE((char) 9824);

    private char shape;
    Suit(char shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "" + shape;
    }
}
