public abstract class Hero {
  public static int idCount = 0;

  private String name;
  private int id;
  private int level;
  private boolean isEquipped;
  private int HP;
  private int MP;

  public Hero(String name) {
    this.name = name;
    this.id = ++idCount;
    this.level = Settings.LEVEL_INIT;
    this.isEquipped = false;

    this.restore();
  }

  public void levelUp() {
    this.level += 1;
    this.restore();
  }

  public void restore() {
    this.HP = this.getMaxHP();
    this.MP = this.getMaxMP();
  }

  public void usePA(Hero enemy) {
    double r = Math.random();
    if (r > this.getCC()) {
      System.out.println(getName() + //
          " uses physical attack on " + enemy.getName());
      enemy.takeDamage(this.getPA());
    } else {
      System.out.println(getName() + //
          " uses physical attack (critical damage) on " + enemy.getName());
      enemy.takeDamage(this.getCD());
    }
  }

  public void useMA(Hero enemy) {
    if (this.getMP() >= this.getConsumeMP()) {
      System.out.println(getName() + //
          " uses magical attack on " + enemy.getName());
      enemy.takeDamage(this.getMA());
      this.MP -= this.getConsumeMP();
    } else {
      System.out.println(getName() + //
          " doesn't have enough MP for magical attack");
    }
  }

  public void takeDamage(int deductHP) {
    this.HP = Math.max(0, this.HP - deductHP);
  }

  public void toEquip() {
    this.isEquipped = true;
  }

  public void toUnequip() {
    this.isEquipped = false;
  }

  public abstract String toString(boolean simplied);

  /////////////////////////////////////////////////////////////////////////////
  // Getter

  // abstract String getName();

  abstract int getRole();

  abstract int getWeaponPA();

  abstract int getWeaponMA();

  abstract double getWeaponCC();

  abstract String getWeaponName();

  public String getHeroType() {
    return Settings.HERO_TYPES[this.getRole()];
  }

  public String getName() {
    return this.name;
  }

  public boolean isAlive() {
    return this.HP > 0;
  }

  public int getId() {
    return this.id;
  }

  public int getLevel() {
    return this.level;
  }

  public boolean isEquipped() {
    return this.isEquipped;
  }

  public int getHP() {
    return this.HP;
  }

  public int getMP() {
    return this.HP;
  }

  public int getMaxHP() {
    return Settings.baseMaxHP[this.getRole()]
        + Settings.incMaxHP[this.getRole()] * (this.level - 1);
  }

  public int getMaxMP() {
    return Settings.baseMaxMP[this.getRole()]
        + Settings.incMaxMP[this.getRole()] * (this.level - 1);
  }

  public int getConsumeMP() {
    return Settings.consumeMP[this.getRole()];
  }

  public int getPA() {
    int addValue = 0;
    if (this.isEquipped)
      addValue = this.getWeaponPA();
    return Settings.basePA[this.getRole()]
        + Settings.incPA[this.getRole()] * (this.level - 1) //
        + addValue;
  }

  public int getPD() {
    return Settings.basePD[this.getRole()]
        + Settings.incPD[this.getRole()] * (this.level - 1);
  }

  public int getMA() {
    int addValue = 0;
    if (this.isEquipped)
      addValue = this.getWeaponMA();
    return Settings.baseMA[this.getRole()]
        + Settings.incMA[this.getRole()] * (this.level - 1) //
        + addValue;
  }

  public int getMD() {
    return Settings.baseMD[this.getRole()]
        + Settings.incMD[this.getRole()] * (this.level - 1);
  }

  public int getAG() {
    return Settings.baseAG[this.getRole()]
        + Settings.incAG[this.getRole()] * (this.level - 1);
  }

  public double getCC() {
    double addValue = 0;
    if (this.isEquipped)
      addValue = this.getWeaponCC();
    double finalValue = Settings.baseCC[this.getRole()]
        + Settings.incCC[this.getRole()] * (this.level - 1) //
        + addValue;
    // return Math.round(finalValue * 100) / 100;
    return finalValue;
  }

  public double getCritMultiplier() {
    return Settings.critMultiplier[this.getRole()];
  }

  public int getCD() {
    return (int) (this.getPA() * this.getCritMultiplier());
  }

  // public String toString() {
  // return getHeroType() + ": " //
  // + "ID=" + this.getId() + ", " //
  // + "name=" + this.getName() + ", " //
  // + "level=" + this.getLevel() + ", " //
  // + "HP=" + this.getHP() + ", " //
  // + "MP=" + this.getMP() + ", " //
  // + "PA=" + this.getPA() + ", " //
  // + "MA=" + this.getMA() + ", " //
  // + "PD=" + this.getPD() + ", " //
  // + "MD=" + this.getMD() + ", " //
  // + "AG=" + this.getAG() + ", " //
  // + "CC=" + this.getCC() + ", " //
  // + "CD=" + this.getCD() + ", " //
  // + "weapon=" + this.getWeaponName();
  // }

  public String toString() {
    return getHeroType() + ": " //
        + "ID=" + this.getId() + ", " //
        + "name=" + this.getName() + ", " //
        + "Lv=" + this.getLevel() + ", " //
        + "HP=" + this.getHP() + ", " //
        + "MP=" + this.getMP() + ", " //
        + "weapon=" + this.getWeaponName();
  }

}
