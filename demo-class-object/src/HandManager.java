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

  // self
  // public boolean isFullHouse() {
  // if (this.cards.length != 5)
  // return false;
  // int[] counts = new int[13];
  // for (int i = 0; i < 13; i++) {
  // for (int j = 0; j < 5; j++) {
  // if (this.cards[j].getRank() == RANKS[i])
  // counts[i]++;
  // }
  // }
  // int count3 = 0;
  // int count2 = 0;
  // for (int count : counts) {
  // if (count == 3)
  // count3++;
  // if (count == 2)
  // count2++;
  // }
  // return (count3 == 1 && count2 == 1);
  // }

  // lesson
  public boolean isFullHouse() {
    if (this.cards.length != 5)
      return false;

    int[] counts = new int[40];
    for (int i = 0; i < this.cards.length; i++) {
      counts[this.cards[i].getRank() - '2']++;
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
    return withThreeCount && withTwoCount;
  }
}
