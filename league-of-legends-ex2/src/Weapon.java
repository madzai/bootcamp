public abstract class Weapon {
  // PA, MA, CC
  private int level;
  private int pa;
  private int ma;
  private double cc;

  abstract int getTier();

  abstract int getRole();

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

}
