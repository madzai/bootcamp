// ID, Level, HP, MP, PA< PD, MA, MD, AG, CC, CD
// constants (role and level): Max HP, Max MP, PA, PD, MA, MD, AG, CC, CD
// CD calculated by critical damage multiplier (by role)

import java.math.BigDecimal;
// import java.util.Random;

public class Mage extends Hero {
  private static final int baseMaxHP = 90;
  private static final int incMaxHP = 10;
  private static final int baseMaxMP = 40;
  private static final int incMaxMP = 10;
  private static final int deductMP = 10;
  private static final int basePA = 40;
  private static final int incPA = 10;
  private static final int basePD = 20;
  private static final int incPD = 10;
  private static final int baseMA = 40;
  private static final int incMA = 10;
  private static final int baseMD = 20;
  private static final int incMD = 10;
  private static final int baseAG = 40;
  private static final int incAG = 10;
  private static final double baseCC = 0.1;
  private static final double incCC = 0.05;
  private static final double critMultiplier = 1.2;

  private String name;
  private int HP;
  private int MP;
  private int maxHP;
  private int maxMP;
  private int PA;
  private int PD;
  private int MA;
  private int MD;
  private int AG;
  private double CC;
  private double CD;

  public Mage(String name) {
    super();
    this.name = name;
    this.maxHP = baseMaxHP;
    this.maxMP = baseMaxMP;
    this.HP = this.maxHP;
    this.MP = this.maxMP;
    this.PA = basePA;
    this.PD = basePD;
    this.MA = baseMA;
    this.MD = baseMD;
    this.AG = baseAG;
    this.CC = baseCC;
    this.CD = BigDecimal.valueOf(critMultiplier)
        .multiply(BigDecimal.valueOf(this.PA)).doubleValue();
  }

  @Override
  public void levelUp() {
    System.out.println("Mage " + this.getId() + " levels up");
    super.levelUp();
    this.maxHP += incMaxHP;
    this.maxMP += incMaxMP;
    this.HP = this.maxHP;
    this.MP = this.maxMP;
    this.PA += incPA;
    this.PD += incPD;
    this.MA += incMA;
    this.MD += incMD;
    this.AG += incAG;
    this.CC =
        BigDecimal.valueOf(baseCC).add(BigDecimal.valueOf(incCC)).doubleValue();
    this.CD = BigDecimal.valueOf(critMultiplier)
        .multiply(BigDecimal.valueOf(this.PA)).doubleValue();
  }

  // public void usePhysicalAttack() {
  // System.out.println("Mage " + this.getId() + " uses physical attack");
  // }

  public void usePhysicalAttack(Mage enemy) {
    System.out.println("Mage " + this.getId() + " uses physical attack");
    enemy.receivePhysicalAttack(this.PA);
  }

  public void receivePhysicalAttack(int pa) {
    this.HP = Math.max(0, this.HP - pa);
  }

  public void useMagicAttack() {
    System.out.println("Mage " + this.getId() + " uses magical attack");
    this.MP = Math.max(0, this.MP - deductMP);
  }

  public void receiveMagicAttack(int ma) {
    this.HP = Math.max(0, this.HP - ma);
  }

  public String getName() {
    return this.name;
  }

  public int getHP() {
    return this.HP;
  }

  public int getMP() {
    return this.MP;
  }

  public int getPA() {
    return this.PA;

    // int critical = new Random().nextInt(99) + 1; // (0-99) + 1 -> (1-100)

    // double critical = Math.random();
    // if (critical > this.CC) {
    // return this.CD;
    // } else {
    // return this.PA;
    // }
  }

  public int getMA() {
    return this.MA;
  }

  public int getAG() {
    return this.AG;
  }

  public double getCC() {
    return this.CC;
  }

  public double getCD() {
    return this.CD;
  }

  public String toString() {
    return "Mage: ID= " + super.getId() + ", " //
        + "HP=" + this.getHP() + ", " //
        + "MP=" + this.getMP() + ", " //
        + "PA=" + this.getPA() + ", " //
        + "AG=" + this.getAG() + ", " //
        + "CC=" + this.getCC() + ", " //
        + "CD=" + this.getCD();
  }



  public static void main(String[] args) {
    // Create heros
    Mage m1 = new Mage();
    Mage m2 = new Mage();
    System.out.println(m1);
    System.out.println(m2);
    System.out.println();
    // Level up
    m1.levelUp();
    System.out.println(m1);
    System.out.println(m2);
    System.out.println();
    // Physical Attack
    m1.usePhysicalAttack();
    m2.receivePhysicalAttack(m1.getPA());
    System.out.println(m1);
    System.out.println(m2);
    System.out.println();
    // Magical Attack
    m1.receiveMagicAttack(m2.getMA());
    m2.useMagicAttack();
    System.out.println(m1);
    System.out.println(m2);
    System.out.println();

    int c = 100;
    double d = 1.2;
    for (int i = 0; i < 10; i++) {
      System.out.println(Math.round((c + i) * d));
    }
    System.out.println((int) (103 * 1.2)); // no error

  }
}
