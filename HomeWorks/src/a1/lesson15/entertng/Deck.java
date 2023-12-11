package a1.lesson15.entertng;

import java.util.Arrays;
import java.util.Random;

public class Deck {
    private Card[] cards;
    private static int totalCards;

    public Deck() {
        cards = new Card[0];
    }

    public void addCard (Card card) {
        if (totalCards<52) {
            if (!Deck.cardExistence (card, cards)) {
                cards = Arrays.copyOf(cards, cards.length + 1);
                cards[cards.length-1] = card;
                totalCards++;
            }
        } else {
            System.out.println ("Deck is complete!");
        }
    }

    public static boolean cardExistence (Card card, Card[] cards) {
        for (Card item : cards) {
            if (item == card) {
                return true;
            }
        }
        return false;
    }

    public void shuffle () {
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            int rndIndex = random.nextInt(cards.length);
            Card temp = cards[rndIndex];
            cards[rndIndex] = cards[i];
            cards[i] = temp;
        }
    }

    public Card[] getCards() {
        return cards;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < cards.length; i++) {
            if (i == 13 || i == 26 || i == 39) {
                s +="\n";
            }
            s += cards[i];
        }
        return s;
    }
}
