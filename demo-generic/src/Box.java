import java.math.BigDecimal;
import java.util.List;

// Line 4 - 22 -> Object (The Ts describe the same thing)
// Line 25 -> Static method has NO relationship with Box<T>
public class Box<T> {
  private T value;

  public Box() {

  }

  public Box(T value) {
    this.value = value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  // Static method is independent of the Object
  // public static <T extends Shape> double totalArea2(List<T> shapes) {
  // BigDecimal total = BigDecimal.ZERO;
  // // ! We confirmed the type of T is <T extends Shape>
  // for (Shape shape : shapes)
  // total = total.add(BigDecimal.valueOf(shape.area()));
  // return total.doubleValue();
  // }

  // ! When do we confirm the T?
  public static void main(String[] args) {
    // ! Compile Time -> confirm T
    Box<String> stringBox = new Box<>();
    // stringBox.setValue(100); // error
    stringBox.setValue("John");
    System.out.println(stringBox.getValue().charAt(0));

    Box<Integer> integerBox = new Box<>();
    // integerBox.setValue("John"); // error
    integerBox.setValue(100);
    System.out.println(integerBox.getValue() + 1);
    System.out.println(integerBox.getValue().longValue()); // 100
    System.out.println(integerBox.getValue().doubleValue()); // 100.0

    // ! Compile time -> didn't confirm the type
    // can store any type, but can't assign methods to use for the data type
    // need downcasting to use methods
    Box<Object> magicBox = new Box<>();
    magicBox.setValue(100);
    // System.out.println(magicBox.getValue() + 1); // compile time error
    magicBox.setValue("John");
    // System.out.println(magicBox.getValue().charAt(0)); // compile time error



  }
}
