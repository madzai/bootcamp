import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
  private int age;

  public Person(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  @Override
  public String toString() {
    return "Person(age=" + this.age + ")";
  }

  @Override
  public int compareTo(Person that) {
    if (this.age >= that.getAge())
      return -1;
    return 1;
  }

  public static void main(String[] args) {
    // sort from oldest to youngest
    List<Person> people = new ArrayList<>();
    people.add(new Person(10));
    people.add(new Person(70));
    people.add(new Person(20));
    people.add(new Person(1000));
    people.add(new Person(400));
    System.out.println(people);

    Collections.sort(people);
    System.out.println(people);
  }
}
