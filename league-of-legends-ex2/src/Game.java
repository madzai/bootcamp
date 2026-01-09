public class Game {

  public static Hero oneVsOne(Hero h1, Hero h2) {
    return oneVsOne(h1, h2, 0.5);
  }

  public static Hero oneVsOne(Hero h1, Hero h2, double c) {
    System.out.println("Players");
    System.out.println(h1);
    System.out.println(h2);
    System.out.println();
    // int round = 1;
    double r = Math.random();

    while (h1.isAlive() && h2.isAlive()) {
      // System.out.println("Round " + round);
      System.out.println(h1.toString(true));
      System.out.println(h2.toString(true));
      r = Math.random();

      if (r <= c) {
        h1.usePA(h2);
      } else {
        h2.usePA(h1);
      }
      // round++;
      System.out.println();
    }

    if (h1.isAlive()) {
      System.out.println(h1.getName() + " wins\n");
      return h1;
    } else {
      System.out.println(h2.getName() + " wins\n");
      return h2;
    }
  }

  public static void stat1Vs1(int n, Hero h1, Hero h2) {
    Hero winner = null;
    int[] winners = new int[n];
    int win1 = 0;
    double winRate1 = 0.0;

    for (int i = 0; i < n; i++) {
      h1.restore();
      h2.restore();
      winner = oneVsOne(h1, h2);
      if (winner == h1) {
        winners[i] = 1;
        win1++;
      } else {
        winners[i] = 2;
      }
    }

    winRate1 = Math.round(win1 * 100 / n);

    for (int i = 0; i < n; i++)
      System.out.println("Game " + (i + 1) + " winner: " + winners[i]);

    System.out.println(
        "Player 1 won " + win1 + " games out of " + n + " games in total");
    System.out.println("Player 1's win rate: " + winRate1 + "%");
  }

  public static void main(String[] args) {
    Warrior p1 = new Warrior("Sam");
    Archer p2 = new Archer("Jane");

    // p1.createWeapon(1, 1);
    // p2.createWeapon(2, 1);

    oneVsOne(p1, p2);

    // int n = 100;
    // stat1Vs1(n, p1, p2);
  }
}
