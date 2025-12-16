// ID, Level, HP, MP, PA< PD, MA, MD, AG, CC, CD
// constants (role and level): Max HP, Max MP, PA, PD, MA, MD, AG, CC, CD
// CD calculated by critical damage multiplier (by role)

import java.math.BigDecimal;

public class Mage extends Hero implements Playable {
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

  public Mage(int id) {
    super(id);
    this.maxHP = baseMaxHP + super.getLevel() * incMaxHP;
    this.maxMP = baseMaxMP + super.getLevel() * incMaxMP;
    this.HP = this.maxHP;
    this.MP = this.maxMP;
    this.PA = basePA + super.getLevel() * incPA;
    this.PD = basePD + super.getLevel() * incPD;
    this.MA = baseMA + super.getLevel() * incMA;
    this.MD = baseMD + super.getLevel() * incMD;
    this.AG = baseAG + super.getLevel() * incAG;
    this.CC =
        BigDecimal.valueOf(baseCC).add(BigDecimal.valueOf(super.getLevel())
            .multiply(BigDecimal.valueOf(incCC))).doubleValue();
    this.CD = BigDecimal.valueOf(critMultiplier)
        .multiply(BigDecimal.valueOf(this.PA)).doubleValue();
  }

  @Override
  public void levelUp() {
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
        BigDecimal.valueOf(baseCC).add(BigDecimal.valueOf(super.getLevel())
            .multiply(BigDecimal.valueOf(incCC))).doubleValue();
    this.CD = BigDecimal.valueOf(critMultiplier)
        .multiply(BigDecimal.valueOf(this.PA)).doubleValue();
  }

  @Override
  public void receivePhysicalAttack(int pa) {
    this.HP = Math.max(0, this.HP - pa);
  }

  @Override
  public void useMagicAttack() {
    this.MP = Math.max(0, this.MP - deductMP);
  }

  @Override
  public void receiveMagicAttack(int ma) {
    this.HP = Math.max(0, this.HP - ma);
  }

  public int getHP() {
    return this.HP;
  }

  public int getMP() {
    return this.MP;
  }

  public int getPA() {
    return this.PA;
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
    return "Mage " + super.getId() + ": " //
        + "HP=" + this.getHP() + ", " //
        + "MP=" + this.getMP() + ", " //
        + "PA=" + this.getPA() + ", " //
        + "AG=" + this.getAG() + ", " //
        + "CC=" + this.getCC() + ", " //
        + "CD=" + this.getCD();
  }



  public static void main(String[] args) {
    // Create heros
    Mage m1 = new Mage(1);
    Mage m2 = new Mage(2);
    System.out.println(m1);
    System.out.println(m2);
    // Level up
    m1.levelUp();
    System.out.println("m1 level up");
    System.out.println(m1);
    System.out.println(m2);
    // Physical Attack
    System.out.println("m1 uses physical attack");
    m2.receivePhysicalAttack(m1.getPA());
    System.out.println(m1);
    System.out.println(m2);
    // Magical Attack
    System.out.println("m2 uses magical attack");
    m1.receiveMagicAttack(m2.getMA());
    m2.useMagicAttack();
    System.out.println(m1);
    System.out.println(m2);

  }
}
