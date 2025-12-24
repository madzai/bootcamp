public class Recurve extends Bow {
  // private int level; // 1-3
  public static final Recurve LEVEL_ONE;
  public static final Recurve LEVEL_TWO;
  public static final Recurve LEVEL_THREE;

  public Recurve(int pa, int ma, double cc) {
    super(pa, ma, cc);
  }

  static {
    LEVEL_ONE = new Recurve(Weapons.BOW_PA[0][0], Weapons.BOW_MA[0][0],
        Weapons.BOW_CC[0][0]);
    LEVEL_TWO = new Recurve(Weapons.BOW_PA[0][1], Weapons.BOW_MA[0][1],
        Weapons.BOW_CC[0][1]);
    LEVEL_THREE = new Recurve(Weapons.BOW_PA[0][2], Weapons.BOW_MA[0][2],
        Weapons.BOW_CC[0][2]);
  }

  public static void main(String[] args) {
    Recurve.LEVEL_ONE.getPa();
  }
}
