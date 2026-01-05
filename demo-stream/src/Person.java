public class Person {
  private int age;

  public Person(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public boolean isElderly() {
    return this.age >= 65;
  }

  @Override
  public String toString() {
    return "Person(age=" + this.age + ")";
  }
}
