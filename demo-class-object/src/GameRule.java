public interface GameRule {
  int getRankStrength(Rank rank);

  // ! Java 8
  default int compare(Rank r1, Rank r2) {
    return this.getRankStrength(r1) - this.getRankStrength(r2);
  };
}
