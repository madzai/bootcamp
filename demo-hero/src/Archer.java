public class Archer extends Hero {
  private String name;

  public Archer() {
    super(1, Heros.maxHp(Heros.ARCHER, 1));
  }

  public Archer(String name) {
    super(1, Heros.maxHp(Heros.ARCHER, 1));
    this.name = name;
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

  // // ! Presentation
  // public int getPa() {
  // return Heros.pa(getRole(), super.getLevel());
  // }

  // // ! Presentation
  // public boolean isCD() {
  // return Math.random() <= Heros.cc(this.getRole(), super.getLevel());
  // }

  // public double getCD() {
  // return this.getPa() * Heros.cdMultipler(this.getRole(), super.getLevel());
  // }

  // // ! this vs hero
  // public void attack(Hero hero) {
  // double toBeDeducted = this.isCD() ? this.getCD() : this.getPa();
  // hero.deductHp((int) (toBeDeducted));
  // }

  public static void main(String[] args) {
    Archer archer = new Archer();
    System.out.println(archer.getHp());
    System.out.println(archer.getPa());

    System.out.println(Math.random()); // 0-1
  }


}
