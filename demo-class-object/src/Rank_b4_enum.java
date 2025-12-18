public class Rank {
  private char value;
  private int seq;

  public Rank(char value, int seq) {
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
    Rank card2 = new Rank('2', 13);
    Rank cardA = new Rank('A', 12);
    Rank cardK = new Rank('K', 11);
    Rank cardQ = new Rank('Q', 10);
    Rank cardJ = new Rank('J', 9);
    Rank card10 = new Rank('0', 8);
    Rank card9 = new Rank('9', 7);
    Rank card8 = new Rank('8', 6);
    Rank card7 = new Rank('7', 5);
    Rank card6 = new Rank('6', 4);
    Rank card5 = new Rank('5', 3);
    Rank card4 = new Rank('4', 2);
    Rank card3 = new Rank('3', 1);

    System.out.println("2: " + card2.getSeq());
    System.out.println("A: " + cardA.getSeq());
    System.out.println("K: " + cardK.getSeq());
    System.out.println("Q: " + cardQ.getSeq());
    System.out.println("J: " + cardJ.getSeq());
    System.out.println("10: " + card10.getSeq());
    System.out.println("9: " + card9.getSeq());
    System.out.println("8: " + card8.getSeq());
    System.out.println("7: " + card7.getSeq());
    System.out.println("6: " + card6.getSeq());
    System.out.println("5: " + card5.getSeq());
    System.out.println("4: " + card4.getSeq());
    System.out.println("3: " + card3.getSeq());
  }
}
