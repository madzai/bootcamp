import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Person implements Comparable<Person> {
  private int age;
  private Occupation occupation;

  public Person(int age, Occupation occupation) {
    this.age = age;
    this.occupation = occupation;
  }

  public Person(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public Occupation getOccupation() {
    return this.occupation;
  }

  @Override
  public String toString() {
    return "Person(age=" + this.age //
        + ",occupation=" + this.occupation + ")";
  }

  @Override
  public int compareTo(Person that) {
    return this.age >= that.getAge() ? -1 : 1;
  }

  public static enum Occupation {
    CLERK, PROGRAMMER, POLICEMAN,;
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

    PriorityQueue<Person> peopleQueue = new PriorityQueue<>(people);
    System.out.println(peopleQueue.poll());
    System.out.println(peopleQueue.poll());
    peopleQueue.add(new Person(800));
    System.out.println("after adding 800");
    System.out.println(peopleQueue.poll());
    System.out.println(peopleQueue.poll());
    System.out.println(peopleQueue.poll());

    // !
    PriorityQueue<Person> personQueue2 =
        new PriorityQueue<>(new SortedByRule1());
    personQueue2.add(new Person(50, Person.Occupation.PROGRAMMER));
    personQueue2.add(new Person(20, Person.Occupation.PROGRAMMER));
    personQueue2.add(new Person(5000, Person.Occupation.CLERK));
    personQueue2.add(new Person(210, Person.Occupation.CLERK));
    personQueue2.add(new Person(45, Person.Occupation.POLICEMAN));
    personQueue2.add(new Person(60, Person.Occupation.POLICEMAN));
    personQueue2.add(new Person(1, Person.Occupation.PROGRAMMER));
    personQueue2.add(new Person(52, Person.Occupation.CLERK));
    System.out.println();
    System.out.println(personQueue2);
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
    System.out.println(personQueue2.poll());
  }
}
