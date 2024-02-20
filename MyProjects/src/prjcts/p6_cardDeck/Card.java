package prjcts.p6_cardDeck;

class Card {
    private String suit;
    private String face;
    private int rank;

    public Card(String suit, String face) {
        this.suit = suit;
        this.face = face;
        rank = switch (face) {
            default -> Integer.parseInt(face) - 1;
            case "J" -> 9;
            case "Q" -> 10;
            case "K" -> 11;
            case "A" -> 12;
        };
    }

    public Card getNumericCard (String suit, int num) {
        return new Card(suit, "" + num);
    }

    @Override
    public String toString() {
        return face + suit + '(' + rank + ')';
    }
}
