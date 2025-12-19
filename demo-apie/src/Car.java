// ! Coding pattern: singleton

public class Car {
  // memory -> ONE Car Object
  public static final Car INSTANCE = new Car("Model Y");

  private final String model; // model can't be modified
  // private String model; // model can be modified

  private Car(String model) {
    this.model = model;
  }

  public String getModel() {
    return this.model;
  }

  // can't run set method if model is set final
  // public void setModel(String model) {
  // this.model = model;
  // }

  public static void main(String[] args) {
    Car c1 = Car.INSTANCE;
    System.out.println(c1.getModel()); // Model Y

    // c1.setModel("Model 3");
    // System.out.println(c1.getModel()); // Model 3
    // final? Car?
  }
}


// public class Car {
// // memory -> ONE Car Object

// private String color;
// public static Car car;

// static {
// System.out.println("static block in Car.java");
// car = new Car();
// }

// private Car() {
// System.out.println("Car is created");
// this.color = "Blue";
// }

// // public Car getCar() {
// // return car;
// // }

// public String getColor() {
// return this.color;
// }

// public static void main(String[] args) {
// System.out.println(Car.car.getColor());

// }
// }
