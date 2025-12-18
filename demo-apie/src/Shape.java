import java.util.Objects;

public abstract class Shape {
  private String color;

  public Shape(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  // ! Abstract method (without implementation)
  // ! Child class MUST implement all abstract methods
  abstract double area();
  // In other words, if the child is not able to implement => it is not a shape

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Shape))
      return false;
    Shape shape = (Shape) o;
    // return shape.getColor().equals(this.color); // dangerous if shape.getColor() is null
    return Objects.equals(shape.getColor(), this.color); // higher level: don't have to choose between == and .equals()
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.color);
  }

  public String toString() {
    return "Shape(" //
        + "color=" //
        + this.color //
        + ")";
  }

}
