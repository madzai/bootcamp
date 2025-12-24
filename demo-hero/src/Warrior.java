public class Warrior extends Hero {
  private static final int STARTING_LEVEL = Heros.STARTING_LEVEL;
  private String name;
  private Sword sword;

  public Warrior() {
    super(STARTING_LEVEL, Heros.maxHp(Heros.WARRIOR, STARTING_LEVEL));
  }

  public Warrior(String name) {
    super(STARTING_LEVEL, Heros.maxHp(Heros.WARRIOR, STARTING_LEVEL));
    this.name = name;
  }

  public void equip(Sword sword) {
    this.sword = sword;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getRole() {
    return Heros.WARRIOR;
  }

  // defense x 2 扣mp
  public void superDefense() {
    System.out.println(this.name + " -> Warrior special skill.");
  }

  public static void main(String[] args) {
    Archer archer = new Archer();
    System.out.println(archer.getHp());
    System.out.println(archer.getPa());

    System.out.println(Math.random()); // 0-1

    Warrior warrior = new Warrior("John");

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
    myHeros[0] = new Warrior("Jenny");
    myHeros[1] = new Archer("Steven");
    myHeros[2] = new Warrior("Tommy");

    // Object Reference Type -> Hero
    // Object Type -> Warrior
    Hero target = new Warrior("Leo");

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
    // heros[1].attack(hero);

    Hero[] heros2 = new Hero[2];
    heros2[0] = new Warrior();
    heros2[1] = new Archer();

    heros2[1].attack(hero);

    // ! Downcasting
    for (Hero h : myHeros) {
      if (h instanceof Warrior) {
        Warrior w1 = (Warrior) h;
        w1.superDefense(); // Jenny Tommy
      }
      h.attack(target); // Jenny Steven Tommy
    }

  }


}
