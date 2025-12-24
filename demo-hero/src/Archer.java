public class Archer extends Hero {
  private String name;
  private Bow bow;

  public Archer() {
    super(1, Heros.maxHp(Heros.ARCHER, 1));
  }

  public Archer(String name) {
    super(1, Heros.maxHp(Heros.ARCHER, 1));
    this.name = name;
  }

  public void equip(Bow bow) {
    this.bow = bow;
  }

  @Override
  public int getPa() {
    int bowPa = this.bow == null ? 0 : this.bow.getPa();
    return super.getPa() + bowPa;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getRole() {
    return Heros.ARCHER;
  }

  public int getHp() {
    return super.getHp();
  }

  public int getLevel() {
    return super.getLevel();
  }

  public int getPa() {
    return super.getPa();
  }

  @Override
  public boolean isCD() {
    double bowCc = this.bow == null ? 0.0 : this.bow.getCc();
    return Math.random() <= Heros.cc(this.getRole(), super.getLevel()) + bowCc;
  }

  public static void main(String[] args) {
    Archer archer = new Archer();
    System.out.println(archer.getHp());
    System.out.println(archer.getPa());

    System.out.println(Math.random()); // 0-1
  }


}
