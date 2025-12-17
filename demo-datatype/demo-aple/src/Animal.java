// ! abstract (抽象) class

// ! Abstract Class
// 1. Cannot be used to create object like new Animal()
// 2. Treated as Parent class
// 3. Has Attributes (common attributes)
// 4. Abstract method

public abstract class Animal { // Parent class
  // ! Cat extends Animal
  private String name;
  private int age;

  public Animal() {
    System.out.println("Animal's empty constructor");
  }

  public Animal(String name, int age) {
    System.out.println("Animal's constructor (name, age)");
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    System.out.println("Animal getName ...");
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void eat() {
    System.out.println("Animal eat...");
  }

  public String toString() {
    return "Animal(" //
        + "name=" + this.name //
        + ", age=" + this.age //
        + ")";
  }

  public static void main(String[] args) {
    System.out.println("Animal");
  }
}
