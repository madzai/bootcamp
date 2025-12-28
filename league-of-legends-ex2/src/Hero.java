// Hero, role: Archer, Mage, Warrior
// ID, Level, HP, MP, PA, PD, MA, MD, AG, CC, CD
// constants (role and level): Max HP, Max MP, PA, PD, MA, MD, AG, CC, CD
// CD calculated by critical damage multiplier (by role)

public abstract class Hero {
  public static int idCount = 0;

  private int id;
  private int level;
  private boolean isEquipped;
  private int HP;
  private int MP;

  private int MaxHP;
  private int MaxMP;
  private int consumeMP;
  private int PA;
  private int PD;
  private int MA;
  private int MD;
  private int AG;
  private double CC;
  private double critMultiplier;
  private int CD;

  private int incMaxHP;
  private int incMaxMP;
  private int incPA;
  private int incPD;
  private int incMA;
  private int incMD;
  private int incAG;
  private double incCC;

  public Hero() {
    this.id = ++idCount;
    this.level = Settings.LEVEL_INIT;
    this.isEquipped = false;

    this.MaxHP = Settings.baseMaxHP[this.getRole()];
    this.MaxMP = Settings.baseMaxMP[this.getRole()];
    this.consumeMP = Settings.consumeMP[this.getRole()];
    this.PA = Settings.basePA[this.getRole()];
    this.PD = Settings.basePD[this.getRole()];
    this.MA = Settings.baseMA[this.getRole()];
    this.MD = Settings.baseMD[this.getRole()];
    this.AG = Settings.baseAG[this.getRole()];
    this.CC = Settings.baseCC[this.getRole()];
    this.critMultiplier = Settings.critMultiplier[this.getRole()];
    this.CD = (int) (this.PA * this.critMultiplier);

    this.incMaxHP = Settings.incMaxHP[this.getRole()];
    this.incMaxMP = Settings.incMaxMP[this.getRole()];
    this.incPA = Settings.incPA[this.getRole()];
    this.incPD = Settings.incPD[this.getRole()];
    this.incMA = Settings.incMA[this.getRole()];
    this.incMD = Settings.incMD[this.getRole()];
    this.incAG = Settings.incAG[this.getRole()];
    this.incCC = Settings.incCC[this.getRole()];

    this.HP = this.MaxHP;
    this.MP = this.MaxMP;
  }

  public void levelUp() {
    this.level += 1;
    this.MaxHP = this.MaxHP + this.incMaxHP;
    this.MaxMP = this.MaxMP + this.incMaxMP;
    this.PA = this.PA + this.incPA;
    this.PD = this.PD + this.incPD;
    this.MA = this.MA + this.incMA;
    this.MD = this.MD + this.incMD;
    this.AG = this.AG + this.incAG;
    this.CC = this.CC + this.incCC;
    this.CD = (int) (this.PA * this.critMultiplier);
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
          " uses critical physical attack on " + enemy.getName());
      enemy.takeDamage(this.CD);
    }
  }

  public void useMA(Hero enemy) {
    System.out.println(getName() + //
        " uses magical attack on " + enemy.getName());
    enemy.takeDamage(this.MA);
    this.MP -= this.consumeMP;
  }

  public void takeDamage(int deductHP) {
    this.HP = Math.max(0, this.HP - deductHP);
  }

  public void toEquip() {
    if (this.isEquipped == false) {
      this.isEquipped = true;
      this.PA += this.getWeaponPA();
      this.MA += this.getWeaponMA();
      this.CC += this.getWeaponCC();
    }

  }

  public void toUnequip() {
    if (this.isEquipped == true) {
      this.isEquipped = false;
      this.PA -= this.getWeaponPA();
      this.MA -= this.getWeaponMA();
      this.CC -= this.getWeaponCC();
    }
  }

  /////////////////////////////////////////////////////////////////////////////
  // Getter

  abstract String getName();

  abstract int getRole();

  abstract int getWeaponPA();

  abstract int getWeaponMA();

  abstract double getWeaponCC();

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

  public int getPA() {
    return this.PA;
  }

  public int getPD() {
    return this.PD;
  }

  public int getMA() {
    return this.MA;
  }

  public int getMD() {
    return this.MD;
  }

  public int getAG() {
    return this.AG;
  }

  public double getCC() {
    return this.CC;
  }

  public int getCD() {
    return this.CD;
  }

}
