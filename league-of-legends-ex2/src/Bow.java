public class Bow extends Weapon {
  private int tier;

  public Bow(int tier) {
    this.tier = tier;
  }

  public int getRole() {
    return Settings.ARCHER;
  }

  public int getLevel() {
    return super.getLevel();
  }

  public int getPa() {
    return super.getPa();
  }

  public int getMa() {
    return super.getMa();
  }

  public double getCc() {
    return super.getCc();
  }

}
