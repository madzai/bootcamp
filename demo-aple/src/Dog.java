// ! Child class
// 1. Child class constructor always calling parent constructor

import java.util.Objects;

public class Dog extends Animal {

  public Dog() {
    // super(); // calling parent's empty constructor
  }

  // Constructor (name, age)
  public Dog(String name, int age) {
    // super(); // parent's empty constructor
    super(name, age); // calling another constructor
  }

  // ! implicitly inherit parent's all instance methods
  @Override // ! check if parent has this method (play safe) or to replace parent's method
  // (return super.getName() below will also run without @Override)
  public String getName() {
    System.out.println("Dog getName...");
    // ! super
    return super.getName();
  }

  @Override
  public void eat() {
    System.out.println("Dog is eating...");
  }

  // this vs o
  @Override
  public boolean equals(Object o) {
    // Step 1
    if (o == this) // same java object in memory
      return true;
    // Step 2
    if (!(o instanceof Dog)) // not a Dog object
      return false;
    Dog dog = (Dog) o; // no risky after instanceof
    // .equals to compare string Name, == to compare int Age
    return dog.getName().equals(super.getName()) //
        && dog.getAge() == super.getAge();
  }

  @Override
  public int hashCode() {
    // ! generate an int value based on different value(s)
    return Objects.hash(super.getName(), super.getAge());
  }

  @Override
  public String toString() {
    return "Dog(" //
        + super.toString() //
        + ")";
  }


  public static void main(String[] args) {
    System.out.println("Dog d1:");
    Dog d1 = new Dog();
    d1.setName("John");
    System.out.println(d1.getName()); // John: use d1's getName() to get Animal's getName()

    System.out.println("Dog d2:");
    Dog d2 = new Dog();
    d2.setName("Bob");
    d2.setAge(5);
    System.out.println(d2.getName()); // Bob
    System.out.println(d2.getAge());

    System.out.println("d2 eating:");
    d2.eat();

    Cat c1 = new Cat();
    c1.setName("Ann");
    c1.setAge(3);
    c1.setHair("brown");
    System.out.println("c1: name " + c1.getName() + ", age " + c1.getAge()
        + ", hair " + c1.getHair());
    System.out.println("c1 eating:");
    c1.eat();

    System.out.println("Dog d3:");
    Dog d3 = new Dog("Steven", 2);
    System.out.println(d3.getName());
    System.out.println(d3.getAge());

  }
}
