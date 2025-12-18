import java.math.BigDecimal;
import java.util.Objects;

public final class Circle extends Shape {
  private double radius;

  public Circle(double radius, String color) {
    super(color);
    this.radius = radius;
  }

  public String getColor() {
    return super.getColor();
  }

  public double getRadius() {
    return this.radius;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(Math.PI) //
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(this.radius)) //
        .doubleValue();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Circle))
      return false;
    Circle circle = (Circle) o;
    return circle.getRadius() == this.getRadius() //
        // && circle.getColor() == super.getColor();
        && super.equals(circle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.radius, super.getColor());
  }

  @Override
  public String toString() {
    return "Circle(" //
        + "radius=" //
        + this.radius //
        + ", " //
        + super.toString() //
        + ")";
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(3.5, "Red");
    System.out.println("Circle Color: " + c1.getColor());
    System.out.println(
        "Circle c1: radius " + c1.getRadius() + ", color: " + c1.getColor());
    System.out.println("Area: " + c1.area()); // ~ 38.48
  }
}
