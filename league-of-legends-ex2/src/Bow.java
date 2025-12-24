public class Bow extends Weapon {
  private int type;

  public Bow(int type) {
    this.type = type;
  }

  public int getRole() {
    return Heros.ARCHER;
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

  // public boolean getIsEquipped() {
  // return super.getIsEquipped();
  // }
}
