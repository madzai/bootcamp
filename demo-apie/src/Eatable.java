// ! Interface
// 1. No Attributes
// 2. Methods are abstract
// 3. No constructor
// 4. Static variable OK (public for calling to use)
// 5. Static method OK (public for calling to use)
public interface Eatable { // 100% Abstraction
  public static String str = "hello";

  void eat(); // implicitly abstract, eqv to abstract void eat();

  public static int sum(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    System.out.println(Eatable.str); // static variable
    System.out.println(Eatable.sum(10, 3)); // 13
  }
}
