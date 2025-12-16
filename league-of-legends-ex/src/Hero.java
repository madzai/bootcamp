// Hero, role: Archer, Mage, Warrior
// ID, Level, HP, MP, PA, PD, MA, MD, AG, CC, CD
// constants (role and level): Max HP, Max MP, PA, PD, MA, MD, AG, CC, CD
// CD calculated by critical damage multiplier (by role)

public class Hero {
  private int id;
  private int level;

  public Hero(int id) {
    this.id = id;
    this.level = 1;
  }

  public void levelUp() {
    this.level += 1;
  }

  public int getId() {
    return this.id;
  }

  public int getLevel() {
    return this.level;
  }

}
