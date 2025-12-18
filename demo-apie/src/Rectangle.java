import java.math.BigDecimal;
import java.util.Objects;

public class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height, String color) {
    super(color);
    this.width = width;
    this.height = height;
  }

  public double area() {
    return BigDecimal.valueOf(this.width) //
        .multiply(BigDecimal.valueOf(this.height)) //
        .doubleValue();
  }

  public String toString() {
    return "Rectangle(" //
        + "width=" + this.width //
        + ",height=" + this.height //
        + "," + super.toString() //
        + ")";
  }

  // this vs o
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Rectangle))
      return false;
    Rectangle rectangle = (Rectangle) o;
    return Objects.equals(this.width, rectangle.getWidth()) //
        && Objects.equals(this.height, rectangle.getHeight()) //
        && Objects.equals(super.getColor(), rectangle.getColor());
    // return rectangle.width == this.width //
    // && rectangle.height == this.height //
    // && rectangle.getColor() == super.getColor();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.width, this.height, super.getColor());
  }

  public double getWidth() {
    return this.width;
  }

  public double getHeight() {
    return this.height;
  }

  public static void main(String[] args) {
    Rectangle r1 = new Rectangle(3.5, 2.5, "Blue");
    Rectangle r2 = new Rectangle(3.5, 2.5, "Blue");
    System.out.println("r1: " + r1);
    System.out.println("r2: " + r2);
    System.out.println("r1 = r1: " + r1.equals(r1)); // true
    System.out.println("r2 = r1: " + r2.equals(r1)); // true (after override)
    System.out
        .println("r1 = r2 in hashcode: " + (r1.hashCode() == r2.hashCode()));

  }
}
