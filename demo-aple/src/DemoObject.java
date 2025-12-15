public class DemoObject {
  public static void main(String[] args) {
    // Object.class (Memory -> Java Object)

    // String.class ("John" -> "John")
    // String.class author overrides equals()

    String s = "hello";
    System.out.println(s.equals("hello")); // true

    Dog d1 = new Dog("Kenny", 1);
    Dog d2 = new Dog("Kenny", 1);
    System.out.println("d1 = d2? " + d1.equals(d2)); // false (before override)
    // ! All Java Objects implicitly extends Object.class

    // toString(), equals(), hashCode()
    // ! before override (Java Object in Memory)
    // Both represent d1 as Java object in Memory
    System.out.println(d1.toString()); // Dog@1f32e575
    System.out.println(d1.hashCode()); // 523429237

    // ! after override
    System.out.println("d1 = d2? (.equals) " + d1.equals(d2)); // true (after override in Dog.java)
    System.out.println(
        "d1 = d2? (based on hashcode) " + (d1.hashCode() == d2.hashCode()));

    System.out.println("d1 to string: " + d1); // Dog(Animal(name=Kenny, age=1))

    Circle c1 = new Circle(3.2, "BLUE");
    Circle c2 = new Circle(3.2, "BLUE");
    System.out.println("c1 equals to c2? " + c1.equals(c2));
    System.out.println(
        "c1 has same hashcode as c2? " + (c1.hashCode() == c2.hashCode()));
    System.out.println("c1: " + c1);
    System.out.println("c2: " + c2);

    Circle c3 = new Circle(3.2, "RED");
    System.out.println("c1 equals to c3? " + c1.equals(c3));
    System.out.println("c3: " + c3);

    Circle c4 = new Circle(1.5, "RED");
    System.out.println("c3 equals to c4? " + c3.equals(c4));
    System.out.println("c4: " + c4);
  }
}
