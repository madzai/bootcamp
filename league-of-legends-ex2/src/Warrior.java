public class Warrior extends Hero {
  private String name;
  private Sword sword;

  public Warrior(String name) {
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

  public Sword getWeapon() {
    return this.sword;
  }

  public void createWeapon(int tier, int level) {
    this.sword = new Sword(tier, level);
    this.toEquip();
  }

  @Override
  public int getWeaponPA() {
    if (this.sword == null)
      return 0;
    return this.sword.getPA();
  }

  @Override
  public int getWeaponMA() {
    if (this.sword == null)
      return 0;
    return this.sword.getMA();
  }

  @Override
  public double getWeaponCC() {
    if (this.sword == null)
      return 0.0;
    return this.sword.getCC();
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
    return Settings.WARRIOR;
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
    return "Warrior: ID=" + super.getId() + ", " //
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
        + "weapon=" + (this.sword == null ? "None" : this.sword.getName())
        + ", " + "equipped=" + this.isEquipped();
  }

  @Override
  public String toString(boolean simplified) {
    if (simplified) {
      return "Warrior: ID=" + super.getId() + ", " //
          + "name=" + this.name + ", " //
          + "Lv=" + super.getLevel() + ", " //
          + "HP=" + this.getHP() + ", " //
          + "MP=" + this.getMP() + //
          (this.isEquipped() ? ", weapon=" + this.sword.getName() : "");
    } else {
      return toString();
    }
  }
}
