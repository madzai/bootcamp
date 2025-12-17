// ! Parent Class: Class or Abstract Class
// Human has no abstract method

public class Superman extends Human implements Flyable {
  // ! compile time: confirmed the object can fly

  // abstract fly()

  public Superman(String name) {
    super(name);
  }

  // compile time: OK if fly() is included
  // compile time: NOK if fly() is not typed below
  @Override
  public void fly() {

  }
}
