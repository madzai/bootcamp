import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {
  // ! Attributes
  private double radius;

  // Default constructor, can be omitted
  public Circle() {

  }

  // Constructor
  public Circle(double radius) {
    this.radius = radius;
  }

  // Instance Methods
  public boolean isTooBig() {
    return this.area() >= 40;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  // Method -> presentation
  // Circle area: a presentation of radius
  public double area() {
    return BigDecimal.valueOf(this.radius)
        .multiply(BigDecimal.valueOf(this.radius))
        .multiply(BigDecimal.valueOf(Math.PI)).setScale(1, RoundingMode.HALF_UP)
        .doubleValue();
  }

  public static void main(String[] args) {
    System.out.println("Pi: " + Math.PI);

    Circle c1 = new Circle();
    c1.setRadius(2.5);
    System.out.println("c1 has radius " + c1.getRadius());
    System.out.println("c1 has area " + c1.area());

    Circle c2 = new Circle(5.0);
    System.out.println("c2 has radius " + c2.getRadius());
    System.out.println("c2 has area " + c2.area());

  }
}
