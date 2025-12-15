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

  public String toString() {
    return "color=" //
        + this.color //
        + ")";
  }

}
