import java.util.Arrays;
import java.util.Random;

// verb + noun (xxxHelper, xxxManager, xxxOwner, etc)
public class ShuffleHelper { // class name -> noun
  private Card[] cards;

  public ShuffleHelper(Card[] cards) {
    this.cards = cards;
  }

  public void shuffle(int times) {
    for (int t = 0; t < times; t++) {
      int cutIdx = new Random().nextInt(41) + 1;
      int idx = 0;
      Card[] newCards = new Card[this.cards.length];
      for (int i = cutIdx; i < cutIdx + 10; i++) {
        newCards[idx++] = this.cards[i];
      }
      for (int i = 0; i < cutIdx; i++) {
        newCards[idx++] = this.cards[i];
      }
      for (int i = cutIdx + 10; i < this.cards.length; i++) {
        newCards[idx++] = this.cards[i];
      }
      this.cards = newCards;
    }
  }

  // public void shuffle() {
  // // random -> int
  // int[] order = new int[cards.length];
  // for (int i = 0; i < order.length; i++) {
  // order[i] = i;
  // }
  // int[] newOrder = order;
  // Random rand = new Random();
  // int idx = rand.nextInt(cards.length) + 1;
  // int nCards = 10;
  // int nShuffle = 100;
  // // 1 - idx - 1 -> 1 - idx - 1
  // // idx - idx + n -> idx + n + 1 - length
  // // idx + n + 1 - length -> idx - idx + n

  // for (int i = 0; i < nShuffle; i++) {
  // do {
  // idx = rand.nextInt(cards.length) + 1;
  // } while (idx + nCards > cards.length);

  // // for (int j = 0; j < cards.length; j++) {
  // // if (j < idx) {

  // // } else if () {

  // // } else {

  // // }
  // }

  // // for (int j = 0; j < idx; j++) {
  // // newOrder[j] = order[j];
  // // }

  // // for (int j = idx; j < idx + nCards; j++) {
  // // newOrder[j] = order[j];
  // // }

  // // for (int j = idx + nCards; j < cards.length; j++) {
  // // newOrder[j] = order[j];
  // // }
  // }

  public Card[] getCards() {
    return this.cards;
  }

  public static void main(String[] args) {
    Deck d1 = new Deck();
    ShuffleHelper sh = new ShuffleHelper(d1.getCards());
    sh.shuffle(1000);
    Card[] afterShuffle = sh.getCards();
    System.out.println(Arrays.toString(afterShuffle));
  }
}

