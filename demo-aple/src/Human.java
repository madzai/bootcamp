// Each Human max hp 100
// sleep -> full hp 100
public class Human implements Eatable, Sleepable {
  // constant
  private static final int MAX_HP = 100;
  private String name;
  private int hp; // health point

  public Human(String name) {
    this.name = name;
    this.hp = 100;
    // this.maxHp = 100;
  }

  @Override
  public void eat() {
    this.hp = Math.min(Human.MAX_HP, this.hp + 10);
  }

  @Override
  public void sleep() {
    this.hp = Human.MAX_HP;
    // this.hp = this.maxHp; // wastes more memory, unless humans can have different max HP
  }

  public void deductHp(int delta) {
    this.hp = Math.max(0, this.hp - delta); // common method

    // if (this.hp <= delta) {
    // this.hp = 0;
    // } else {
    // this.hp -= delta;
    // }

    // this.hp -= (this.hp <= delta) ? this.hp : delta;

  }

  public static void main(String[] args) {
    Human h1 = new Human("Hugo");
    h1.eat();
    h1.sleep();
    // h1.fly(); // error

    Superman s1 = new Superman("Steven");
    s1.eat();
    s1.sleep();
    s1.fly();
  }
}
