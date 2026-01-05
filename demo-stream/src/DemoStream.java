import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DemoStream {
  public static void main(String[] args) {
    // 66, 40, 30, 20
    // List.of() -> Java 11
    List<Person> persons = new ArrayList<>(List.of(new Person(66),
        new Person(40), new Person(30), new Person(20)));

    // Find a list of Elderly (return a new list)
    List<Person> elderlyPersons = new ArrayList<>();
    for (Person person : persons) {
      if (person.isElderly())
        elderlyPersons.add(person);
    }
    System.out.println(elderlyPersons);

    // ! Stream
    Predicate<Person> elderlyFormula = p -> p.isElderly();
    // Predicate<Person> elderlyFormula = p -> p.getAge() > 65;

    List<Person> elderlyList = persons.stream() // return Stream<Person>
        .filter(elderlyFormula) // return Stream<Person>
        .collect(Collectors.toList()); // return List<Person> (new ArrayList Object)

    System.out.println(elderlyList);
    System.out.println(persons); // ! No change


    // John 10, Sally 3, Leo 8, Steven 5
    Cat c1 = Cat.builder().name("John").age(10).build();
    Cat c2 = Cat.builder().name("Sally").age(3).build();
    Cat c3 = Cat.builder().name("Leo").age(8).build();
    Cat c4 = Cat.builder().name("Steven").age(5).build();
    List<Cat> cats = new ArrayList<>(List.of(c1, c2, c3, c4));


    // Find a new list of cats, whose age > 4 and name has char 'n'
    List<Cat> targetCats = cats.stream() //
        .filter(c -> (c.getAge() > 4 && c.getName().contains("n"))) //
        .collect(Collectors.toList());
    System.out.println(targetCats);


    // Ball
    // RED 10, BLUE 3, RED 12, YELLOW 8, BLUE 4
    // Find all blue and yellow balls
    List<Ball> balls = new ArrayList<>(List.of( //
        new Ball(Ball.Color.RED, 10), // Color enum within Ball.java (not Ball Object properties)
        new Ball(Ball.Color.BLUE, 3), //
        new Ball(Ball.Color.RED, 12), //
        new Ball(Ball.Color.YELLOW, 8), //
        new Ball(Ball.Color.BLUE, 4) //
    ));
    System.out.println(balls);

    // ! List<Ball> to List<Ball>
    // ! Find all blue & yellow balls
    System.out.println("\nFind all blue & yellow balls");
    List<Ball> targetBalls = balls.stream() //
        .filter(b -> b.getColor() == Ball.Color.BLUE //
            || b.getColor() == Ball.Color.YELLOW) //
        .collect(Collectors.toList());
    System.out.println(targetBalls);

    // ! Find all balls with blue and yellow color. Return the number of the balls
    // ! List<Ball> to List<Integer>
    List<Integer> targetNumbers = balls.stream() //
        .filter(b -> b.getColor() == Ball.Color.BLUE
            || b.getColor() == Ball.Color.YELLOW) //
        .map(b -> b.getNum()) //
        .collect(Collectors.toList());
    System.out.println(targetNumbers);

    // sort(): Collections.sort(), Arrays.sort()
    List<Integer> targetSortedNumbers = balls.stream() //
        .filter(b -> b.getColor() == Ball.Color.BLUE
            || b.getColor() == Ball.Color.YELLOW) //
        .map(b -> b.getNum()) //
        .sorted() // ! natural order
        .collect(Collectors.toList());
    System.out.println(targetSortedNumbers); // [3, 4, 8]

    // Descending Order (Comparator)
    List<Integer> targetSortedDescNumbers = balls.stream() //
        .filter(b -> b.getColor() == Ball.Color.BLUE
            || b.getColor() == Ball.Color.YELLOW) //
        .map(b -> b.getNum()) //
        .sorted((n1, n2) -> n1 > n2 ? -1 : 1) // ! Descending order
        .collect(Collectors.toList());
    System.out.println(targetSortedDescNumbers); // [8, 4, 3]

  }
}
