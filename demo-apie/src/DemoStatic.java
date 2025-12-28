public class DemoStatic {
  // 1. static variable
  // 2. static final variable (cannot be modified)
  // 3. instance variable (object variable)
  // 4. final variable (object variable)

  private static final int SECONDS_IN_MINUTE = 60;
  private static int idCounter = 0;
  private String name;
  private static final String DEFAULT_NAME = "John";

  public DemoStatic() {
    // Logic, API, DB
    this.name = DEFAULT_NAME;
    // this.name = this.getName(); // error: can't use get name method before object is created
  }

  // ! input parameters -> produce output
  public static int sum(int x, int y) {
    return x + y;
    // return x + y + this.name; // error: static method can't access an object's attribute
    // return x + y + SECONDS_IN_MINUTE; // OK
  }

  // ! input parameters -> can't produce output (must be instance method)
  // public static String getName(String s) { // error
  public String getName(String s) {
    return this.name + s;
  }

  // public String getName() {
  // return this.name;
  // }


  public static void main(String[] args) {
    System.out.println(sum(2, 5)); // 7
    DemoStatic d1 = new DemoStatic();
    System.out.println(d1.getName("!!!")); // John!!!
  }
}
