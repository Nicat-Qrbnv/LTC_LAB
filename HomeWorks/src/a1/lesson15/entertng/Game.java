package a1.lesson15.entertng;

public class Game {
    private Deck deck;
    private final Player[] players = new Player[4];

    public Game(Deck deck) {
        this.deck = deck;
    }

    public void addPlayer (Player player) {

        for (int i = 0; i < players.length; i++) {
            if (players[i] == null){
                players[i] = player;
                break;
            }
        }

    }

    public void shuffleDeck() {
        deck.shuffle();
    }

    public void distributeCards () {
        int distributionCount = 0;
        for (int d = 0; d < 6; d++) {

            for (Card c : deck.getCards()) {
                for (Player p : players) {
                    p.receiveCard(c);
                }
            }

        }
    }

    public void getPlayers() {
        String s = "";
        for (Player p : players) {
            s += ( p.toString() + "\n" );
        }
        System.out.println (s);
    }
}
