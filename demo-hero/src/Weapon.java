public abstract class Weapon {
  private int pa;
  private int ma;
  private double cc;

  public Weapon(int pa, int ma, double cc) {
    this.pa = pa;
    this.ma = ma;
    this.cc = cc;
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
