public class Warrior extends Hero {
  private static final int STARTING_LEVEL = Heros.STARTING_LEVEL;
  private String name;

  public Warrior() {
    super(STARTING_LEVEL, Heros.maxHp(Heros.WARRIOR, STARTING_LEVEL));
  }

  public Warrior(String name) {
    super(STARTING_LEVEL, Heros.maxHp(Heros.WARRIOR, STARTING_LEVEL));
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getRole() {
    return Heros.WARRIOR;
  }

  // Defense x 2, (deduct MP)
  public void superDefense() {
    System.out.println(this.name + " -> Warrior special skill");
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

    Warrior warrior = new Warrior();

    System.out.println(warrior.getHp()); // 10
    archer.attack(warrior);
    System.out.println(warrior.getHp()); // 7

    // ! Polymorphism
    Archer a1 = new Archer();

    // Object Reference Type can be different to Object Type.
    Hero hero = new Archer();
    // Archer a2 = new Hero(); // Error

    // ! Why do we need Parent Class?
    Hero[] myHeros = new Hero[3];
    myHeros[0] = new Warrior("Tommy");
    myHeros[1] = new Archer("Jenny");
    myHeros[2] = new Warrior("Stephen");

    // Object Reference Type -> Hero
    // Object Type -> Warrior
    Hero target = new Warrior("Enemy");

    for (Hero h : myHeros) {
      // ! 1. During compile time, Java won't confirm the actual object type.
      // ! 2. Based on Object Reference Type for calling method.
      h.attack(target);
    }

    // ! Because Cat did not extend Hero
    // Hero h1 = new Cat();

    // Hero Cat
    // Object as reference type, it can point to all classes of object
    Object o = new Cat(); // ! hiding
    o = new Warrior();
    o = new Archer();

    Object[] heros = new Object[2];
    heros[0] = new Warrior();
    heros[1] = new Archer();
    // Based on Object Reference Type for calling method
    // heros[0].attack(hero); // error as Object class doesn't have attack method

    Hero[] heros2 = new Hero[2];
    heros2[0] = new Warrior();
    heros2[1] = new Archer();
    heros2[1].attack(hero); // Hero extends Object class implicitly, Object > Hero > Warrior

    // Case for using Downcasting
    for (Hero h : myHeros) {
      if (h instanceof Warrior) {
        Warrior w1 = (Warrior) h;
        w1.superDefense();
      }
      h.attack(target); // h is w1
    }

  }
}
