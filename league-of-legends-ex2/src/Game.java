public class Game {

  public static void 1vs1(Hero h1, Hero h2, double c) {
    int round = 1;
    while (h1.isAlive() && h2.isAlive()) {
      System.out.println("Round " + round);
      System.out.println(h1);
      System.out.println(h2);
      double r = Math.random();
      if (r <= c) {
        h1.usePA(h2);
      } else {
        h2.usePA(h1);
      }
      round++;
      System.out.println();
   }
   if (h1.isAlive())
    System.out.println(h1.getName() + " wins");
   else 
    System.out.println(h2.getName() + " wins");
  

}
