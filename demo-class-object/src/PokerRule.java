public enum PokerRule implements GameRule {
  INSTANCE;

  // index 0-12
  private static final int[] STRENGTHS = new int[] { //
      2, // THREE
      3, //
      4, //
      5, //
      6, //
      7, //
      8, //
      9, //
      10, //
      11, //
      12, // KING
      13, // ACE
      1 // TWO
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

}
