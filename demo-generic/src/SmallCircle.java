import java.util.List;

public class SmallCircle extends Circle {

  public SmallCircle(int radius) {
    super(radius);
  }

  // List<? super Circle>
  // allowed:
  // 1. List<Shape>
  // 2. List<Circle>
  // but List<Square> not allowed (because List can be List<Circle>)
  // Shape, Circle, SmallCircle are allowed
  public static void add(List<? super Circle> circles) {
    circles.add(new SmallCircle(4));
    circles.add(new Circle(2));

    // ! error because not sure the type of "circles" is shaoe
    // circles.add(new Square(3));

  }
}
