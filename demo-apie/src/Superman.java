// ! Parent Class: Class or Abstract Class
// Human has no abstract method

public class Superman extends Human implements Flyable {
  // ! compile time: confirmed the object can fly
  // private static final int FLY_SPEED;
  // private static final Superman leader;

  // ! Static block
  // static {
  // System.out.println("Static block");
  // FLY_SPEED = 100;
  // leader = new Superman("Ben");
  // }

  // abstract fly()

  static {
    System.out.println("Superman static block");
  }

  public Superman(String name) {
    super(name);
    System.out.println("Superman's constructor");
  }

  // compile time: OK if fly() is included
  // compile time: NOK if fly() is not typed below
  @Override
  public void fly() {
    System.out.println(Person.FLY_SPEED);
  }

  // @Override - cannot override a final method in parent
  // public void run() {

  // }

  public String getName() {
    return super.getName();
  }

  public static void main(String[] args) {
    // ! JVM -> main()
    new Superman("Ken").run();
    new Superman("Tom").run();
    // Static block is called only once (run before main())

    // Static block
    // Superman's constructor
    // Running
    // Superman's constructor
    // Running

  }
}
