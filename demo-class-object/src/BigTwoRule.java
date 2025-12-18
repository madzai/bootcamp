public enum BigTwoRule implements GameRule {
  INSTANCE;

  // index 0-12
  private static final int[] STRENGTHS = new int[] { //
      1, // THREE
      2, // FOUR
      3, // FIVE
      4, // SIX
      5, //
      6, //
      7, //
      8, //
      9, //
      10, //
      11, // KING
      12, // ACE
      13 // TWO
  };

  // Not needed (included in GameRule interface already)
  // r1 vs r2
  // public int compare(Rank r1, Rank r2) {
  // return this.getRankStrength(r1) - this.getRankStrength(r2);
  // }

  // ! Learning point
  public int getRankStrength(Rank rank) {
    return STRENGTHS[rank.ordinal()]; // natural order in Rank.java
  }

  public static void main(String[] args) {
    BigTwoRule rule = BigTwoRule.INSTANCE;
    System.out.println("Rank of TWO in Big Two");
    System.out.println(rule.getRankStrength(Rank.TWO)); // 13

    PokerRule rule2 = PokerRule.INSTANCE;
    System.out.println("Rank of TWO in Poker");
    System.out.println(rule2.getRankStrength(Rank.TWO)); // 2
  }
}
