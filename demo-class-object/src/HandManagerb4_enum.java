public class HandManager {
  public static char[] RANKS = new char[] //
  {'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K'};

  private Card[] cards;

  public HandManager(Card[] cards) {
    this.cards = cards;
  }

  public boolean isFlush() {
    if (this.cards.length != 5)
      return false;

    if (this.cards[0].getSuit() != this.cards[1].getSuit()
        || this.cards[1].getSuit() != this.cards[2].getSuit()
        || this.cards[2].getSuit() != this.cards[3].getSuit()
        || this.cards[3].getSuit() != this.cards[4].getSuit())
      return false;

    return true;
  }

  // Test Case Design (IT test based on programming) vs BA test (based on requirement, user's perspective)
  // 1. return statement
  // 2. for loop (break, continue)
  // 3. array (margin case)
  public boolean isFullHouse() {
    if (this.cards.length != 5)
      return false;

    int[] counts = new int[40];
    for (int i = 0; i < this.cards.length; i++) {
      counts[this.cards[i].getRank().getValue() - '2']++; // ! '2' is smallest ASCII
    }
    // 3 2
    boolean withThreeCount = false;
    boolean withTwoCount = false;
    for (int i = 0; i < counts.length; i++) { // 40 times
      if (counts[i] == 3)
        withThreeCount = true;
      if (counts[i] == 2)
        withTwoCount = true;
    }
    return withThreeCount && withTwoCount; // 4 cases
  }

  public static void main(String[] args) {
    Card[] cards = new Card[] {new Card('A', 12, 'D'), new Card('A', 12, 'S'),
        new Card('A', 12, 'C'), new Card('8', 6, 'D'), new Card('8', 6, 'S')};
    System.out.println(new HandManager(cards).isFullHouse());

    Card[] cards2 = new Card[] {new Card('A', 12, 'D'), new Card('A', 12, 'S'),
        new Card('K', 11, 'C'), new Card('8', 6, 'D'), new Card('8', 6, 'S')};
    System.out.println(new HandManager(cards2).isFullHouse());
  }
}
