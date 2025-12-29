import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
  abstract double area();

  // ! Shape is the parent of Square/Circle
  // ! But List<Shape> is NOT the parent of List<Square>/List<Circle>
  public static double totalArea(List<Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    for (Shape shape : shapes)
      // ! shape.area() -> Polymorphism
      // The type of shape is Shape, Shape.class has area()
      // Runtime decides which area method is executed
      total.add(BigDecimal.valueOf(shape.area()));
    return total.doubleValue();
  }

  // ! Runtime decides the type of T
  // <T extends Shape> -> the range of T
  public static <T extends Shape> double totalArea2(List<T> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    // ! We confirmed the type of T is <T extends Shape>
    for (Shape shape : shapes)
      total = total.add(BigDecimal.valueOf(shape.area()));
    return total.doubleValue();
  }

  public static double totalArea3(List<? extends Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    for (Shape shape : shapes)
      total = total.add(BigDecimal.valueOf(shape.area()));
    return total.doubleValue();
  }

  public static void main(String[] args) {
    List<Circle> circles = new ArrayList<>();
    circles.add(new Circle(3));

    List<Square> squares = new ArrayList<>();
    squares.add(new Square(10));

    List<Shape> shapes = new ArrayList<>();
    shapes.add(new Circle(4));
    shapes.add(new Square(8));

    // Area is enough for practical use
    // Putting List of Shape instead of List of Circle/Square
    System.out.println(totalArea(shapes));
    // System.out.println(totalArea(squares)); // error
    // System.out.println(totalArea(circles)); // error

    // Area 2 - generic is more flexible, but too complicated
    // Avoid using generic in general unless needed, otherwise over-design
    // e.g. only use Generic if List of Circles will be input by user
    System.out.println("Area 2");
    System.out.println(totalArea2(shapes));
    System.out.println(totalArea2(squares));
    System.out.println(totalArea2(circles));

    System.out.println("Area 3");
    System.out.println(totalArea3(shapes));
    System.out.println(totalArea3(squares));
    System.out.println(totalArea3(circles));

  }
}
