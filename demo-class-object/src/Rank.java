public enum Rank {
  CARD2('2', 13), CARDA('A', 12), CARDK('K', 11), CARDQ('Q', 10), CARDJ('J', 9), //
  CARD10('0', 8), CARD9('9', 7), CARD8('8', 6), CARD7('7', 5), CARD6('6', 4), //
  CARD5('5', 3), CARD4('4', 2), CARD3('3', 1);

  private char value;
  private int seq;

  private Rank(char value, int seq) {
    this.value = value;
    this.seq = seq;
  }

  public char getValue() {
    return this.value;
  }

  public int getSeq() {
    return this.seq;
  }

  public static void main(String[] args) {

  }
}
