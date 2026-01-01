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

  @Override
  public String toString() {
    return "Mage: ID=" + super.getId() + ", " //
        + "name=" + this.name + ", " //
        + "Lv=" + super.getLevel() + ", " //
        + "HP=" + this.getHP() + ", " //
        + "MP=" + this.getMP() + ", " //
        + "PA=" + this.getPA() + ", " //
        + "MA=" + this.getMA() + ", " //
        + "PD=" + this.getPD() + ", " //
        + "MD=" + this.getMD() + ", " //
        + "AG=" + this.getAG() + ", " //
        + "CC=" + this.getCC() + ", " //
        + "CD=" + this.getCD() + ", " //
        + "weapon=" + (this.stave == null ? "None" : this.stave.getName())
        + ", " + "equipped=" + this.isEquipped();
  }

  @Override
  public String toString(boolean simplified) {
    if (simplified) {
      return "Mage: ID=" + super.getId() + ", " //
          + "name=" + this.name + ", " //
          + "Lv=" + super.getLevel() + ", " //
          + "HP=" + this.getHP() + ", " //
          + "MP=" + this.getMP() + //
          (this.isEquipped() ? ", weapon=" + this.stave.getName() : "");
    } else {
      return toString();
    }
  }



  public static void main(String[] args) {
    // Create heros
    Mage m1 = new Mage("Anna");
    Mage m2 = new Mage("Roy");
    System.out.println(m1);
    System.out.println(m2);
    System.out.println();
    // weapons
    System.out.println("Create and equip weapon");
    m1.createWeapon(2, 1);
    System.out.println(m1);
    System.out.println(m2);
    System.out.println("Unequip weapon");
    m1.toUnequip();
    System.out.println(m1);
    // Level up
    System.out.println("Level up");
    m1.levelUp();
    System.out.println(m1);
    System.out.println(m2);
    System.out.println();
    // weapons
    System.out.println("Create and equip weapon");
    m2.createWeapon(1, 1);
    System.out.println(m1);
    System.out.println(m2);
    // Physical Attack
    System.out.println("Physical Attack");
    m1.usePA(m2);
    System.out.println(m1);
    System.out.println(m2);
    System.out.println();
    // Magical Attack
    System.out.println("Magical Attack");
    m2.useMA(m1);
    System.out.println(m1);
    System.out.println(m2);
    System.out.println();

  }
}
