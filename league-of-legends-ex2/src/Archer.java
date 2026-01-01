public class Archer extends Hero {
  private String name;
  private Bow bow;

  public Archer(String name) {
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

  public Bow getWeapon() {
    return this.bow;
  }

  public void createWeapon(int tier, int level) {
    this.bow = new Bow(tier, level);
    this.toEquip();
  }

  @Override
  public int getWeaponPA() {
    if (this.bow == null)
      return 0;
    return this.bow.getPA();
  }

  @Override
  public int getWeaponMA() {
    if (this.bow == null)
      return 0;
    return this.bow.getMA();
  }

  @Override
  public double getWeaponCC() {
    if (this.bow == null)
      return 0.0;
    return this.bow.getCC();
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
    return Settings.ARCHER;
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
    return "Archer: ID=" + super.getId() + ", " //
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
        + "weapon=" + (this.bow == null ? "None" : this.bow.getName()) + ", "
        + "equipped=" + this.isEquipped();
  }

  @Override
  public String toString(boolean simplified) {
    if (simplified) {
      return "Archer: ID=" + super.getId() + ", " //
          + "name=" + this.name + ", " //
          + "Lv=" + super.getLevel() + ", " //
          + "HP=" + this.getHP() + ", " //
          + "MP=" + this.getMP() + //
          (this.isEquipped() ? ", weapon=" + this.bow.getName() : "");
    } else {
      return toString();
    }
  }
}
