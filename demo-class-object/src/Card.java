public class Card {
  // private char rank; // A 2 3 4 5 6 7 8 9 0 J Q K
  private Rank rank; // A 2 3 4 5 6 7 8 9 0 J Q K
  private char suit; // D C H S

  // constructor
  public Card(Rank rank, char suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public static Card ofACE(char suit) {
    return new Card(Rank.ACE, suit);
  }

  // get
  public Rank getRank() {
    return this.rank;
  }

  public char getSuit() {
    return this.suit;
  }

  // ! No Setter

  public String toString() {
    return "Card(" //
        + "rank=" + this.rank //
        + ", suit=" + this.suit //
        + ")";
  }

  // public String toString() {
  // return (this.rank.getValue() + this.suit);
  // }

  public static void main(String[] args) {
    Card.ofACE('D');
  }

}
