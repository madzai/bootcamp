public class DemoWrapper {
  public static void main(String[] args) {
    // Wrapper class
    // 8 primitives -> 8 wrapper classes

    // x is a variable
    int x = 3;

    // Box (Object)
    // x2 is an object
    Integer x2 = 3;

    // Same: + operation
    x = x + 3;
    x2 = x2 + 3; // OK

    // Difference
    // Range of x: -2.1 billion to 2.1 billion
    // ! Range of x2: -2.1 billion to 2.1 billion and NULL
    x2 = null;
    // x2 = x2 + 3; // java.lang.NullPointerException

    //
    byte b1 = 4;
    Byte b2 = 4;

    //
    short s1 = 5;
    Short s2 = 5;

    //
    long l1 = 6; // OK
    // ! Java doesn't allow multi-conversion
    // Long l2 = 6; // 6 (int) -> 6 (long) -> (Long)
    Long l2 = 6L; // 6 (long) -> Long

    //
    float f1 = 9.5f;
    Float f2 = 9.5f;

    //
    double d1 = 5.5;
    Double d2 = 5.5;

    //
    char c1 = 'c';
    Character c2 = 'c'; // auto-box
    System.out.println(c1 + 2); // 101
    System.out.println(c2 + 2); // 101

    //
    boolean bl1 = true;
    Boolean bl2 = true; // auto-box

    // auto-box
    int x10 = 10;
    Integer x20 = x10; // auto-box: put value 10 into Integer box
    System.out.println(x20.doubleValue()); // 10.0

    // ! Never use >, <=, >, >=, == for wrapper classes
    System.out.println(x20.equals(10)); // true
    System.out.println(x20.compareTo(10)); // 0
    System.out.println(x20.compareTo(8)); // 1
    System.out.println(x20.compareTo(12)); // -1

    // ! Workds, but don't use it
    System.out.println(x20 > 8); // true
    System.out.println(x20 > 12); // false

    // ! OK to use + - / * (for Integer, not for Double)

    if (x20.compareTo(6) > 0) {
      System.out.println("x20 > 6");
    }

    int x30 = x20; // ! un-box
    System.out.println("x30: " + x30); // 10

  }
}
