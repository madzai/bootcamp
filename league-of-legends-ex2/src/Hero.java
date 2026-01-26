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

    // this.HP = this.MaxHP;
    // this.MP = this.MaxMP;
  }

  public void levelUp() {
    this.level += 1;
    // this.HP = this.MaxHP;
    // this.MP = this.MaxMP;
  }

  public void restore() {
    this.HP = this.MaxHP;
    this.MP = this.MaxMP;
  }

  public void usePA(Hero enemy) {
    double r = Math.random();
    if (r > this.CC) {
      System.out.println(getName() + //
          " uses physical attack on " + enemy.getName());
      enemy.takeDamage(this.PA);
    } else {
      System.out.println(getName() + //
          " uses physical attack (critical damage) on " + enemy.getName());
      enemy.takeDamage(this.CD);
    }
  }

  public void useMA(Hero enemy) {
    if (this.MP >= this.consumeMP) {
      System.out.println(getName() + //
          " uses magical attack on " + enemy.getName());
      enemy.takeDamage(this.MA);
      this.MP -= this.consumeMP;
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
        + this.incMaxHP * (this.level - 1);
  }

  public int getMaxMP() {
    return Settings.baseMaxMP[this.getRole()]
        + this.incMaxMP * (this.level - 1);
  }

  public int getPA() {
    return Settings.basePA[this.getRole()] + this.incPA * (this.level - 1) //
        + this.isEquipped ? this.getWeaponPA() : 0;
  }

  public int getPD() {
    return Settings.basePD[this.getRole()] + this.incPD * (this.level - 1);
  }

  public int getMA() {
    return Settings.baseMA[this.getRole()] + this.incMA * (this.level - 1) //
        + this.isEquipped ? this.getWeaponMA() : 0;
  }

  public int getMD() {
    return this.Settings.baseMD[this.getRole()] + this.incMD * (this.level - 1);
  }

  public int getAG() {
    return Settings.baseAG[this.getRole()] + this.incAG * (this.level - 1);
  }

  public double getCC() {
    return Settings.baseCC[this.getRole()] + this.incCC * (this.level - 1) //
        + this.isEquipped ? this.getWeaponCC() : 0;
  }

  public int getCD() {
    return (int) (this.getPA() * this.critMultiplier);
  }

}
