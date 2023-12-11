package a1.lesson15.entertng;

public class Main {
    public static void main(String[] args) {

        Rank[] ranks = new Rank[]{
                new Rank("2", 1), new Rank("3", 2),
                new Rank("4", 3), new Rank("5", 4),
                new Rank("6", 5), new Rank("7", 6),
                new Rank("8", 7), new Rank("9", 8),
                new Rank("10", 9), new Rank("J", 10),
                new Rank("Q", 11), new Rank("K", 12),
                new Rank("A", 13)
        };

        Card[] hearts = new Card[13];
        for (int i = 0; i < 13; i++) {
            hearts[i] = new Card("\u2661", ranks[i]);
        }

        Card[] diamonds = new Card[13];
        for (int i = 0; i < 13; i++) {
            diamonds[i] = new Card("\u2662", ranks[i]);
        }

        Card[] spades = new Card[13];
        for (int i = 0; i < 13; i++) {
            spades[i] = new Card("\u2660", ranks[i]);
        }

        Card[] clubs = new Card[13];
        for (int i = 0; i < 13; i++) {
            clubs[i] = new Card("\u2663", ranks[i]);
        }

        Deck d1 = new Deck();
        for (Card h : hearts) {
            d1.addCard(h);
        }
        for (Card d : diamonds) {
            d1.addCard(d);
        }
        for (Card s : spades) {
            d1.addCard(s);
        }
        for (Card c : clubs) {
            d1.addCard(c);
        }

        Player p1 = new Player("P1");
        Player p2 = new Player("P2");
        Player p3 = new Player("P3");
        Player p4 = new Player("P4");

        Game g1 = new Game(d1);
        g1.addPlayer(p1);
        g1.addPlayer(p2);
        g1.addPlayer(p3);
        g1.addPlayer(p4);

        g1.shuffleDeck();

        g1.distributeCards();

        g1.getPlayers();
    }
}
