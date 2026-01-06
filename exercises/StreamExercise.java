package exercises;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExercise {

  public static class Children {
    private String name;
    private int score;

    public Children(String name, int score) {
      this.name = name;
      this.score = score;
    }

    public String getName() {
      return this.name;
    }

    public int getScore() {
      return this.score;
    }
  }

  public static class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
      this.name = name;
      this.price = price;
    }

    public String getName() {
      return this.name;
    }

    public int getPrice() {
      return this.price;
    }
  }

  public static class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
      this.name = name;
      this.score = score;
    }

    public String getName() {
      return this.name;
    }

    public int getScore() {
      return this.score;
    }
  }

  public static class Worker {
    private String name;
    private String department;

    public Worker(String name, String department) {
      this.name = name;
      this.department = department;
    }

    public String getName() {
      return this.name;
    }

    public String getDepartment() {
      return this.department;
    }
  }

  public static class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
      this.name = name;
      this.salary = salary;
    }

    public String getName() {
      return this.name;
    }

    public int getSalary() {
      return this.salary;
    }
  }

  public static class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return this.name;
    }

    public int getAge() {
      return this.age;
    }

    @Override
    public String toString() {
      return "Person(" //
          + "name=" + this.name //
          + ", age=" + this.age //
          + ")";
    }
  }

  public static class Staff {
    public static enum Gender {
      Male, Female;
    }

    private String name;
    private Gender gender;

    public Staff(String name, Gender gender) {
      this.name = name;
      this.gender = gender;
    }

    public String getName() {
      return this.name;
    }

    public Gender getGender() {
      return this.gender;
    }
  }

  public static void main(String[] args) {
    // 1. Basic Stream Operations
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
    // sort the result in descending order.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [100, 64, 36, 16, 4]
    List<Integer> q1 = numbers.stream() //
        .filter(n -> n % 2 == 0) //
        .map(n -> n * n) //
        // .sorted((n1, n2) -> n1 > n2 ? -1 : 1) //
        .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    System.out.println("Q1: " + q1);

    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    List<String> names =
        Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    // Output: [Alice, Annie, Alex]
    List<String> q2 = names.stream() //
        // .filter(n -> n.charAt(0) == 'A') //
        .filter(e -> e.startsWith("A")) //
        .collect(Collectors.toList());
    System.out.println("Q2: " + q2);

    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);
    // Output: Max: 30
    // Output: Min: 5

    // List<Integer> q3 = numbers2.stream() //
    // .sorted((n1, n2) -> n1 > n2 ? -1 : 1) //
    // .collect(Collectors.toList());
    // System.out.println("Q3: " + q3);
    // System.out.println("Q3 max: " + q3.get(0));
    // System.out.println("Q3 min: " + q3.get(q3.size() - 1));

    int max = numbers2.stream() //
        .mapToInt(e -> e.intValue()) // Primitive -> max/min
        .max() //
        .getAsInt(); //

    int min = numbers2.stream() //
        .mapToInt(e -> e.intValue()) // Primitive -> max/min
        .min() //
        .getAsInt(); //

    System.out.println("Q3 (max, min): " + max + ", " + min);

    // 4. Mapping to a List of Lengths
    // Task: Given a list of strings, map each string to its length and collect the lengths into a
    // List<Integer>
    List<String> wordsQ4 = Arrays.asList("apple", "banana", "pear");
    // Output: [5, 6, 4] (List)
    List<Integer> q4 = wordsQ4.stream() //
        .map(w -> w.length()) //
        .collect(Collectors.toList());
    System.out.println("Q4: " + q4);

    // 5. Counting Elements
    // Task: Given a list of strings, count how many strings have a length greater than 3.
    List<String> words =
        Arrays.asList("hi", "hello", "world", "java", "stream");
    // Output: 4
    // ! Terminal Operation (collect, count) / Intermediate operation (filter, map)
    long q5 = words.stream() //
        .filter(w -> w.length() > 3) //
        .count();
    System.out.println("Q5: " + q5);

    // 6. Filtering and Collecting to a Set
    // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a
    // Set.
    List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
    // Output: [15, 20]

    // List<Integer> numbers3b = numbers3.stream() //
    // .filter(n -> n > 10) //
    // .collect(Collectors.toList());
    // Set<Integer> q6 = new HashSet<>();
    // q6.addAll(numbers3b);

    // ! collect(Collectors.toSet())
    Set<Integer> q6 = numbers3.stream() //
        .filter(n -> n > 10) //
        .collect(Collectors.toSet()); // new HashSet()

    System.out.println("Q6: " + q6);



    // 7. Mapping to a Map (Key-Value Pairs)
    // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
    // where the key is the student's name and the value is their score.

    // Create Student Class
    Student s1 = new Student("Alice", 85);
    Student s2 = new Student("Bob", 75);
    List<Student> students = Arrays.asList(s1, s2);
    Map<String, Integer> q7 = students.stream() //
        .collect(Collectors.toMap(stu -> stu.getName(), stu -> stu.getScore()));
    // Output: {Alice=85, Bob=75}
    System.out.println("Q7: " + q7);

    // 8. Filtering and Mapping to a List of Objects
    // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
    // map them to a list of their names.

    // Create Employee Class
    Employee e1 = new Employee("John", 65000);
    Employee e2 = new Employee("Jane", 55000);
    Employee e3 = new Employee("Doe", 40000);

    List<Employee> employees = new ArrayList<>();
    employees.add(e1);
    employees.add(e2);
    employees.add(e3);

    List<String> q8 = employees.stream() //
        .filter(e -> e.getSalary() > 50000) //
        .map(e -> e.getName()) //
        .collect(Collectors.toList());

    // Output: [John, Jane]
    System.out.println("Q8: " + q8);

    // 9. Grouping and Collecting to a Map (Group by Age)
    // Task: Given a list of people with their names and ages, group them by age and collect the result
    // into a Map<Integer, List<String>> where the key is the age and the value is a list of names.

    // Create Person Class
    Person p1 = new Person("Alice", 30);
    Person p2 = new Person("Bob", 25);
    Person p3 = new Person("Charlie", 30);
    List<Person> persons = new ArrayList<>(Arrays.asList(p1, p2, p3));

    // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)
    // Map<Integer, List<String>> q9 = persons.stream() //
    // .collect(Collectors.groupingBy(Person::getAge, //
    // Collectors.mapping(Person::getName, Collectors.toList())));
    Map<Integer, List<String>> q9 = persons.stream() //
        .collect(Collectors.groupingBy(e -> e.getAge(), //
            Collectors.mapping(e -> e.getName(), Collectors.toList())));
    System.out.println("Q9: " + q9);

    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    // Task: Given a list of Staff with their names and genders, partition them into two groups: male
    // and female, and collect the result into a Map<Boolean, List<Person>>.

    // Create Staff Class
    Staff staff1 = new Staff("Alice", Staff.Gender.Female);
    Staff staff2 = new Staff("Bob", Staff.Gender.Male);
    Staff staff3 = new Staff("Charlie", Staff.Gender.Male);
    List<Staff> staffs = new ArrayList<>(Arrays.asList(staff1, staff2, staff3));

    // Output: {false=[Alice], true=[Bob, Charlie]} (Map)
    Map<Boolean, List<String>> q10 = staffs.stream() //
        .collect(Collectors.groupingBy(e -> e.getGender() == Staff.Gender.Male, //
            Collectors.mapping(e -> e.getName(), Collectors.toList())));
    System.out.println("Q10: " + q10);

    // 11. Filtering, Mapping, and Collecting to a List
    // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers
    // by 2, and collect the result into a List.

    List<Integer> numbers4 = Arrays.asList(5, 15, 20, 7, 30);
    // Output: [30, 40, 60]
    List<Integer> q11 = numbers4.stream() //
        .filter(e -> e > 10) //
        .map(e -> e * 2) //
        .collect(Collectors.toList());
    System.out.println("Q11: " + q11);

    // 12. Mapping to a Custom Object and Collecting to a List
    // Task: Given a list of names and a constant default value, map each name to a Person object (name
    // and default value for age) and collect the result into a list.

    List<String> studentNames = Arrays.asList("Alice", "Bob", "Charlie");
    int defaultAge = 30;
    // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]
    List<Person> q12 = studentNames.stream() //
        .map(e -> new Person(e, defaultAge)) //
        .collect(Collectors.toList());
    System.out.println("Q12: " + q12);

    // 13. Mapping and Collecting to a Deque
    // Task: Given a list of words, map each word to its uppercase form and collect the result into a
    // Deque.

    List<String> wordsQ13 = Arrays.asList("hello", "world", "java");
    // Output: [HELLO, WORLD, JAVA] (Deque)
    Deque<String> q13 = wordsQ13.stream() //
        .map(e -> e.toUpperCase()) //
        .collect(Collectors.toCollection(() -> new ArrayDeque<>()));
    // .collect(Collectors.toCollection(ArrayDeque::new));
    System.out.println("Q13: " + q13);

    // 14. Transforming and Collecting to an Array
    // Task: Given a list of integers, square each number and collect the result into an array.

    List<Integer> numbersQ14 = Arrays.asList(1, 2, 3, 4);
    // Output: [1, 4, 9, 16]
    List<Integer> q14 = numbersQ14.stream() //
        .map(e -> e * e) //
        .collect(Collectors.toList());

    System.out.println("Q14: " + q14);

    // 15. Map and Reduce
    // Task: Given a list of products with their prices, use the map and reduce methods to calculate the
    // total price of all products.

    // Create Product Class
    Product prod1 = new Product("Book", 10);
    Product prod2 = new Product("Pen", 5);
    Product prod3 = new Product("Notebook", 7);
    List<Product> products = Arrays.asList(prod1, prod2, prod3);

    // Output: 22
    // int q15 = products.stream() //
    // .map(e -> e.getPrice()) //
    // .mapToInt(e -> e.intValue()) //
    // .sum();

    int q15 = products.stream() //
        .map(e -> e.getPrice()) //
        .reduce(0, (n1, n2) -> n1 + n2);

    System.out.println("Q15: " + q15);

    // 16. Grouping
    // Task: Given a list of employees with their department names, use groupingBy method to group the
    // employees by department.

    // Create Worker Class
    Worker worker1 = new Worker("Alice", "HR");
    Worker worker2 = new Worker("Bob", "IT");
    Worker worker3 = new Worker("Charlie", "HR");
    Worker worker4 = new Worker("David", "IT");
    List<Worker> workers =
        new ArrayList<>(List.of(worker1, worker2, worker3, worker4));

    Map<String, List<String>> q16 = workers.stream() //
        .collect(Collectors.groupingBy(e -> e.getDepartment(),
            Collectors.mapping(e -> e.getName(), Collectors.toList())));

    // Output: {HR=[Alice, Charlie], IT=[Bob, David]}
    System.out.println("Q16: " + q16);

    // 17. Parallel Streams
    // Task: Given a list of numbers, use a parallel stream to calculate the sum of all elements.
    List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Output: 55
    int q17 = numbers5.parallelStream() //
        .mapToInt(e -> e.intValue()) //
        .sum();
    System.out.println("Q17: " + q17);

    // 18. FlatMap
    // Task: Given a list of lists of numbers, flatten them into a single list and filter only the
    // numbers greater than 5.

    // ! flatMap
    List<List<Integer>> listOfIntegers = Arrays.asList( //
        Arrays.asList(1, 2, 3), //
        Arrays.asList(4, 5, 6), //
        Arrays.asList(7, 8, 9) //
    );
    // Output: [6, 7, 8, 9]
    List<Integer> q18 = listOfIntegers.stream() //
        .flatMap(l -> l.stream()) // ! l.stream() -> return Stream<Integer>
        .filter(number -> number > 5) //
        .collect(Collectors.toList());
    System.out.println("Q18: " + q18);

    // 19. Distinct and Sorting
    // Task: Given a list of strings with some duplicates, remove the duplicates and return the result
    // in alphabetical order.

    List<String> fruits =
        Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
    // Output: [apple, banana, grape, orange]
    List<String> q19 = fruits.stream() //
        .distinct() //
        .sorted() //
        .collect(Collectors.toList());
    System.out.println("Q19: " + q19);

    // 20. Partitioning By
    // Task: Given a list of Childrens with their scores, partition the Childrens into passing and failing
    // groups (pass if score >= 50).
    // Create Student first.

    // Create Children Class
    List<Children> children = new ArrayList<>(List.of( //
        new Children("Alice", 45), //
        new Children("Bob", 55), //
        new Children("Charlie", 40), //
        new Children("David", 70) //
    ));

    Map<Boolean, List<String>> q20 = children.stream() //
        .collect(Collectors.partitioningBy(c -> c.getScore() >= 50, //
            Collectors.mapping(c -> c.getName(), Collectors.toList())));

    // Output: {false=[Alice, Charlie], true=[Bob, David]}
    System.out.println("Q20: " + q20);

    // 21. Joining Strings
    // Task: Given a list of words, join them into a single string separated by commas.

    List<String> languages = Arrays.asList("Java", "Python", "Rust", "R", "Go");
    // Output: "Java, Python, Rust, R, Go"
    String q21 = languages.stream() //
        .collect(Collectors.joining(", "));
    System.out.println("Q21: " + q21);

    // 22. Find First and Any
    // Task: Given a list of integers, find the first number that is divisible by 3.
    List<Integer> ages = Arrays.asList(4, 7, 9, 12, 16, 21);

    // Output: 9
    Optional<Integer> q22 = ages.stream() //
        .filter(e -> e % 3 == 0) //
        .findFirst();
    if (q22.isPresent())
      System.out.println("Q22: " + q22.get());

    // 23. Limit and Skip
    // Task: Given a list of numbers, skip the first 3 elements and return the next 5 elements.

    List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> q23 = elements.stream() //
        .skip(3L) //
        .limit(5L) //
        .collect(Collectors.toList());

    // Output: [4, 5, 6, 7, 8]
    System.out.println("Q23: " + q23);

    // 24. Peek
    // Task: Given a list of integers, double each element and use the peek method to log the
    // intermediate results to the console.
    System.out.println("Q24");
    List<Integer> amounts = Arrays.asList(1, 2, 3, 4);
    List<Integer> q24 = amounts.stream() //
        .map(e -> e * 2) //
        .peek(e -> System.out.println(e)) //
        .collect(Collectors.toList());
    // Intermediate output: 2, 4, 6, 8
    // Final Output: [2, 4, 6, 8]
    System.out.println(q24);

    // 25. Optional and Streams
    // Task: Given a list of strings, use Streams to find the first string longer than 4 characters.
    // Handle the case where no such string exists using Optional.

    List<String> animals = Arrays.asList("cat", "tiger", "panda", "dog");
    // Output: Optional[tiger]
    // System.out.println("Q25: " + q25);

    List<String> animals2 = Arrays.asList("cat", "dog", "bird");
    // Output: Optional.empty

    // 26. Custom Collector
    // Task: Create a custom collector that collects the elements of a stream and remove all duplicates

    List<Integer> duplicates = Arrays.asList(2, 1, 2, 3, 4, 3, 5, 5, 6);
    Set<Integer> q26 = duplicates.stream() //
        .collect(Collectors.toSet());
    // Output: [1, 2, 3, 4, 5, 6] (Set)
    System.out.println("Q26: " + q26);

    // Custom Collector.of() method (advanced)
    Set<Integer> uniqueNums = duplicates.stream() //
        .collect(Collector.of(() -> new HashSet<>(), //
            (s, i) -> s.add(i), //
            (set1, set2) -> {
              set1.addAll(set2);
              return set1;
            }, Collector.Characteristics.UNORDERED));
    System.out.println(uniqueNums);

    // new ArrayBlockingQueue<>(sum)
    // new ConcurrentHashMap<>()

    // 27. String Length Calculation
    // Task: Given a list of strings, calculate the total number of characters in all the strings
    // combined.

    List<String> keywords =
        Arrays.asList("stream", "filter", "map", "sorted", "collect");

    int q27 = keywords.stream() //
        .map(e -> e.length()) //
        .mapToInt(e -> e.intValue()) //
        .sum();
    // Output: 28
    System.out.println("Q27: " + q27);


  }



}
