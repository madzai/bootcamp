// Hero, role: Archer, Mage, Warrior
// ID, Level, HP, MP, PA, PD, MA, MD, AG, CC, CD
// constants (role and level): Max HP, Max MP, PA, PD, MA, MD, AG, CC, CD
// CD calculated by critical damage multiplier (by role)

public class Hero {
  public static int idCount = 0;

  private int id;
  private int level;
  private boolean equipWeapon;

  public Hero() {
    this.id = ++idCount;
    this.level = 1;
    this.equipWeapon = false;

  }

  public void levelUp() {
    this.level += 1;
  }

  public void PhysicalAttack(Hero enemy) {
    System.out
        .println(getName() + " uses physical attack on " + enemy.getName());
  }

  public void receiveAttack(int deductHP) {
    this.HP = Math.max(0, this.HP - deductHP);
  }

  public int getId() {
    return this.id;
  }

  public int getLevel() {
    return this.level;
  }

  public boolean equipWeapon() {
    return this.equipWeapon;
  }
}
