package a1.lesson15.entertng;

import java.util.Arrays;

public class Player {
    private String name;
    private final Card[] hand = new Card[5];

    public Player(String name) {
        this.name = name;
    }

    public void receiveCard (Card card) {
        for (Card c : hand) {
            if (c == null) {
                c = card;
            }
        }
    }

    @Override
    public String toString() {
        return "Hand of " + name + " : " + Arrays.toString(hand);
    }
}
