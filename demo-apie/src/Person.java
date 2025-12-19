public class Person extends Human {
  public static final int FLY_SPEED;
  private static final Superman leader;

  public Person(String name) {
    super(name);
  }

  // ! Static block
  static {
    System.out.println("Person static block");
    FLY_SPEED = 100;
    leader = new Superman("Ben");
  }

  public static void main(String[] args) {
    System.out.println(Person.FLY_SPEED);
    System.out.println(Person.leader.getName());
  }
}
