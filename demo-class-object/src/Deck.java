public class Deck {
  // ! static
  // public static char KING = 'K';
  // public static char ACE = 'A';

  public static char[] RANKS = new char[] //
  {'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K'};

  public static char[] SUITS = new char[] //
  {'D', 'C', 'H', 'S'};

  // ! Attribute
  private Card[] cards;

  // control a deck has 52 cards ONLY
  public Deck() {
    this.cards = new Card[RANKS.length * SUITS.length];
    int idx = 0;
    for (char suit : SUITS) {
      for (char rank : RANKS) {
        this.cards[idx++] = new Card(rank, suit);
      }
    }
  }

  public Card[] getCards() {
    return this.cards;
  }

  public static void main(String[] args) {
    Deck d1 = new Deck();

    System.out.println(d1.getCards()[0].getRank() + d1.getCards()[0].getSuit());

    // for (int i = 0; i < 52; i++)
    // System.out
    // .println(d1.getCards()[i].getRank() + d1.getCards()[i].getSuit());
  }

}
