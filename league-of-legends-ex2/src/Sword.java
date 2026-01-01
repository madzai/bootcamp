public class Sword {
  private int tier;
  private int level;

  public Sword(int tier, int level) {
    this.tier = tier;
    this.level = level;
  }

  public void levelUp() {
    if (this.level < 3)
      this.level++;
  }

  public int getTier() {
    return this.tier;
  }

  public int getLevel() {
    return this.level;
  }

  public int getRole() {
    return Settings.WARRIOR;
  }

  public String getName() {
    // return Settings.SWORD_NAMES[this.tier - 1];
    return Settings.WEAPON_NAMES[this.tier - 1][this.getRole()];
  }

  public int getPA() {
    // return Settings.SWORD_PA[this.tier - 1][this.level - 1];
    return Settings.WEAPON_PA[this.tier - 1][this.getRole()];
  }

  public int getMA() {
    // return Settings.SWORD_MA[this.tier - 1][this.level - 1];
    return Settings.WEAPON_MA[this.tier - 1][this.getRole()];
  }

  public double getCC() {
    // return Settings.SWORD_CC[this.tier - 1][this.level - 1];
    return Settings.WEAPON_CC[this.tier - 1][this.getRole()];
  }

  public String toString() {
    return "Sword: name=" + this.getName() + ", " //
        + "tier=" + this.tier + ", " //
        + "level=" + this.level + ", " //
        + "PA=" + this.getPA() + ", " //
        + "MA=" + this.getMA() + ", " //
        + "CC=" + this.getCC();
  }
}
