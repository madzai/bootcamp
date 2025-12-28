// ID, Level, HP, MP, PA< PD, MA, MD, AG, CC, CD
// constants (role and level): Max HP, Max MP, PA, PD, MA, MD, AG, CC, CD
// CD calculated by critical damage multiplier (by role)

public class Mage extends Hero {

  private String name;
  private Stave stave;

  public Mage(String name) {
    super();
    this.name = name;
  }

  public void levelUp() {
    super.levelUp();
  }

  public void usePA(Hero enemy) {
    super.usePA(enemy);
  }

  public void useMA(Hero enemy) {
    super.useMA(enemy);
  }

  public void takeDamage(int deductHP) {
    super.takeDamage(deductHP);
  }

  public Stave getWeapon() {
    return this.stave;
  }

  public void createWeapon(int tier, int level) {
    this.stave = new Stave(tier, level);
    this.toEquip();
  }

  @Override
  public int getWeaponPA() {
    if (this.stave == null)
      return 0;
    return this.stave.getPA();
  }

  @Override
  public int getWeaponMA() {
    if (this.stave == null)
      return 0;
    return this.stave.getMA();
  }

  @Override
  public double getWeaponCC() {
    if (this.stave == null)
      return 0.0;
    return this.stave.getCC();
  }

  public void toEquip() {
    super.toEquip();
  }

  public void toUnequip() {
    super.toUnequip();
  }

  public boolean isEquipped() {
    return super.isEquipped();
  }


  /////////////////////////////////////////////////////////////////////////////
  // Getter
  public String getName() {
    return this.name;
  }

  public int getRole() {
    return Settings.MAGE;
  }

  public int getHP() {
    return super.getHP();
  }

  public int getMP() {
    return super.getMP();
  }

  public int getPA() {
    return super.getPA();
  }

  public int getMA() {
    return super.getMA();
  }

  public int getAG() {
    return super.getAG();
  }

  public double getCC() {
    return super.getCC();
  }

  public int getCD() {
    return super.getCD();
  }

  public String toString() {
    return "Mage: ID= " + super.getId() + ", " //
        + "name=" + this.name + ", " //
        + "HP=" + this.getHP() + ", " //
        + "MP=" + this.getMP() + ", " //
        + "PA=" + this.getPA() + ", " //
        + "MA=" + this.getMA() + ", " //
        + "AG=" + this.getAG() + ", " //
        + "CC=" + this.getCC() + ", " //
        + "CD=" + this.getCD() + ", " //
        // + "equipped=" + this.isEquipped() + ", " //
        + "weapon=" + (this.stave == null ? "None" : this.stave.getName());
  }



  public static void main(String[] args) {
    // Create heros
    Mage m1 = new Mage("Anna");
    Mage m2 = new Mage("Roy");
    System.out.println(m1);
    System.out.println(m2);
    System.out.println();
    // weapons
    // if (m1.stave == null) {
    // System.out.println("m1 has no weapon");
    // }
    m1.createWeapon(2, 1);
    // System.out.println("m1's weapon: " + m1.getWeapon());
    // System.out.println("m2's weapon: " + m2.getWeapon());
    System.out.println(m1);
    System.out.println(m2);
    // // Level up
    // m1.levelUp();
    // System.out.println(m1);
    // System.out.println(m2);
    // System.out.println();
    // // Physical Attack
    // m1.usePhysicalAttack();
    // m2.receivePhysicalAttack(m1.getPA());
    // System.out.println(m1);
    // System.out.println(m2);
    // System.out.println();
    // // Magical Attack
    // m1.receiveMagicAttack(m2.getMA());
    // m2.useMagicAttack();
    // System.out.println(m1);
    // System.out.println(m2);
    // System.out.println();

    // double rand = Math.random();
    // System.out.println(rand);

    // int c = 130;
    // double d = 1.2;
    // if (rand <= 0.4)
    // System.out.println((int) (c * d));
    // else
    // System.out.println(c);


    // for (int i = 0; i < 10; i++) {
    // System.out.println(Math.round((c + i) * d));
    // }
    // System.out.println((int) (103 * 1.2)); // no error

  }
}
