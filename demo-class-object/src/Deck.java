public class Deck {
  // ! static
  // public static char KING = 'K';
  // public static char ACE = 'A';

  // public static char[] RANKS = new char[] //
  // {'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K'};

  // public static int[] RANKS_SEQ = new int[] //
  // {12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public static Rank[] RANKS = new Rank[] {new Rank('A', 12), new Rank('2', 13),
      new Rank('3', 1), new Rank('4', 2), new Rank('5', 3), new Rank('6', 4),
      new Rank('7', 5), new Rank('8', 6), new Rank('9', 7), new Rank('0', 9),
      new Rank('J', 9), new Rank('Q', 10), new Rank('K', 11)};

  public static char[] SUITS = new char[] //
  {'D', 'C', 'H', 'S'};

  // ! Attribute
  private Card[] cards;

  // control a deck has 52 cards ONLY
  public Deck() {
    this.cards = new Card[RANKS.length * SUITS.length];
    int idx = 0;
    for (char suit : SUITS) {
      for (Rank rank : RANKS) {
        this.cards[idx++] = new Card(rank, suit);
      }
    }
  }

  public Card[] getCards() {
    return this.cards;
  }

  public static void main(String[] args) {
    Deck d1 = new Deck();

    // System.out.println(d1.getCards()[0].getRank() + d1.getCards()[0].getSuit());

    // for (int i = 0; i < 52; i++)
    // System.out
    // .println(d1.getCards()[i].getRank() + d1.getCards()[i].getSuit());
  }

}
