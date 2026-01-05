import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoLambda {
  //
  public static void main(String[] args) {
    // After Java 8: Lambda Expression
    // Functional Interface (One Method Interface)

    // Java Built-in Lambda Function
    // 1. Function (method: input -> output)

    // Compile time confirm the type of Function (input String, output: Integer)
    // Given s, return int
    Function<String, Integer> stringLengthFormula = s -> s.length(); // (s) not needed if only 1 parameter
    System.out.println(stringLengthFormula.apply("hello")); // 5

    // ! Lambda Expression: Write a formula (java method), call the only method inside the object
    Function<Integer, Integer> integerSquare = n -> n * n;
    System.out.println(integerSquare.apply(2));

    Function<String, String> trimAndUppercase = s -> s.trim().toUpperCase();
    System.out.println(trimAndUppercase.apply("  helloAbC  "));

    // Before Java 8
    TrimAndUppercase trimAndUpperCase2 = new TrimAndUppercase();
    System.out.println(trimAndUpperCase2.apply(" Hello World .. "));

    Function<String, String> trimAndUpperCase3 = new Function<>() {
      @Override
      public String apply(String s) {
        return s.trim().toUpperCase();
      }
    };
    System.out.println(trimAndUpperCase3.apply(" ufufu  "));

    // 2. BiFunction (2 inputs -> 1 output)
    BiFunction<String, String, String> concatFunction =
        (s1, s2) -> s1.concat(s2);
    System.out.println(concatFunction.apply("Hello ", "world"));

    BiFunction<Integer, Integer, Integer> sumofTwoNum = (i1, i2) -> (i1 + i2);
    System.out.println(sumofTwoNum.apply(20, 48));

    // Custom Functional Interface
    MathOperation addition = (x, y) -> x + y;
    MathOperation substraction = (x, y) -> x - y;
    System.out.println(addition.operate(3, 4));
    System.out.println(substraction.operate(3, 4));

    // 3. Consumer (input -> no output), void method
    List<String> names = new ArrayList<>();
    names.add("Steven");
    names.add("John");
    names.add("Leo");
    for (String name : names) {
      System.out.println(name);
    }

    // forEach()
    Consumer<String> printOut = s -> System.out.println(s);
    names.forEach(printOut);

    // Without {}, you can write one line of code only
    names.forEach(s -> System.out.println(s));

    // With {}, can write more than one line, and need to use "return" if required
    // no need for forEach(), as forEach requires consumable as input
    System.out.println();
    names.forEach(s -> {
      System.out.println(s);
      System.err.println("hello");
    });

    // 4. Supplier (no input, but with output)
    // random -> 1-49
    // Supplier<Integer> markSixGenerator = () -> (int) (Math.random() * 49) + 1;
    Supplier<Integer> markSixGenerator = () -> new Random().nextInt(49) + 1;
    System.out.println(markSixGenerator.get());

    // 5. Predicate
    Predicate<Person> isElderly = p -> p.isElderly();
    // Predicate<Person> isElderly = p -> p.getAge() >= 65;
    System.out.println(isElderly.test(new Person(67)));
    System.out.println(isElderly.test(new Person(37)));

    // BiConsumer, BiPredicate

    // ! Example: Map
    Map<Integer, String> studentMap = new HashMap<>();
    studentMap.put(1, "John");
    studentMap.put(2, "Mary");
    studentMap.put(3, "Sally");

    studentMap.computeIfAbsent(4, stuNo -> "N/A");
    studentMap.computeIfAbsent(2, stuNo -> "N/A");
    System.out.println(studentMap); // {1=John, 2=Mary, 3=Sally, 4=N/A}


    for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
      System.out
          .println("key=" + entry.getKey() + ",value=" + entry.getValue());
    }

    studentMap
        .forEach((k, v) -> System.out.println("key=" + k + ",value=" + v));



  }
}
