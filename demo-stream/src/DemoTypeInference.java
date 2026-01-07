import java.util.HashMap;
import java.util.LinkedList;

public class DemoTypeInference {
  // ! CANNOT
  // private var name = "John"; // error

  public static void main(String[] args) {
    String name = "John";
    // name = 123; // error

    var email = "john@gmail.com";
    // email = 123; // error
    System.out.println("email is String: " + email instanceof String); // true

    var integers = new LinkedList<Integer>();
    integers.add(100);

    var fruitMap = new HashMap<String, String>();
    fruitMap.put("abc", "apple");

    var dog = new Dog();

    for (var n : integers) {
      System.out.println(n);
    }

    // ! CANNOT
    // public static int sum(var x, var y) {
    // return x + y;
    // }

    // ! CANNOT
    // var result = sum(1, 2); // error as Return type of sum() is uncertain on right side
    // public static var sum(int x, int y) {
    // return x + y;
    // }

  }
}
