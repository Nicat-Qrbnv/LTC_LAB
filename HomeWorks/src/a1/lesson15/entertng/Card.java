package a1.lesson15.entertng;

import java.util.Objects;

public class Card {

    private final String suit;
    private final Rank rankOfCard;

    public Card (String suit, Rank rankOfCard) {
        this.suit = suit;
        this.rankOfCard = rankOfCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card card)) return false;
        return Objects.equals(suit, card.suit) && Objects.equals(rankOfCard, card.rankOfCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rankOfCard);
    }

    @Override
    public String toString() {
        return String.format("[%s%2s]", suit, rankOfCard);
    }
}
