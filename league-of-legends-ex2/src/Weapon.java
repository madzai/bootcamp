public abstract class Weapon {
  // PA, MA, CC
  private int tier;
  private int level;
  private int pa;
  private int ma;
  private double cc;

  abstract int getRole();

  public int getTier() {
    return this.tier;
  }

  public int getLevel() {
    return this.level;
  }

  public int getPa() {
    return this.pa;
  }

  public int getMa() {
    return this.ma;
  }

  public double getCc() {
    return this.cc;
  }

  public String getName() {
    // return Settings.STAVE_NAMES[this.tier - 1];
    return Settings.WEAPON_NAMES[this.tier - 1][this.getRole()];
  }

  public int getPA() {
    // return Settings.STAVE_PA[this.tier - 1][this.level - 1];
    return Settings.WEAPON_PA[this.tier - 1][this.getRole()];
  }

  public int getMA() {
    // return Settings.STAVE_MA[this.tier - 1][this.level - 1];
    return Settings.WEAPON_MA[this.tier - 1][this.getRole()];
  }

  public double getCC() {
    // return Settings.STAVE_CC[this.tier - 1][this.level - 1];
    return Settings.WEAPON_CC[this.tier - 1][this.getRole()];
  }

  public String toString() {
    return Settings.WEAPON_TYPES[this.getRole()] //
        + ": name=" + this.getName() + ", " //
        + "tier=" + this.tier + ", " //
        + "level=" + this.level + ", " //
        + "PA=" + this.getPA() + ", " //
        + "MA=" + this.getMA() + ", " //
        + "CC=" + this.getCC();
  }

}
