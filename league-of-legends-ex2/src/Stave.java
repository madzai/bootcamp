public class Stave {
  private int tier;
  private int level;
  private boolean isEquipped;

  public Stave(int tier, int level) {
    this.tier = tier;
    this.level = level;
    // this.isEquipped = false;
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
    return Settings.MAGE;
  }

  public String getName() {
    return Settings.STAVE_NAMES[this.tier - 1];
  }

  public int getPA() {
    return Settings.STAVE_PA[this.tier - 1][this.level - 1];
  }

  public int getMA() {
    return Settings.STAVE_MA[this.tier - 1][this.level - 1];
  }

  public double getCC() {
    return Settings.STAVE_CC[this.tier - 1][this.level - 1];
  }

  public String toString() {
    return "Stave: name=" + this.getName() + ", " //
        + "tier=" + this.tier + ", " //
        + "level=" + this.level + ", " //
        + "PA=" + this.getPA() + ", " //
        + "MA=" + this.getMA() + ", " //
        + "CC=" + this.getCC();
  }

}
