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

