public class Circle extends Shape {
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return this.radius;
  }

  @Override
  public double area() {
    return this.radius * this.radius * Math.PI;
  }
}
