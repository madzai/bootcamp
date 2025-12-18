public class Car {
  // memory -> ONE Car Object

  private String color;

  static {
    System.out.println("static block in Car.java");
    Car car = new Car();
  }

  private Car() {
    System.out.println("Car is created");
    this.color = "Blue";
  }

  // public Car getCar() {
  // return car;
  // }

  public String getColor() {
    return this.color;
  }

  public static void main(String[] args) {
    // System.out.println(car.getColor());

  }
}
