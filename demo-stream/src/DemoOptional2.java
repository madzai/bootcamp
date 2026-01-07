import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DemoOptional2 {

  private static List<String> fruitDatabase =
      List.of("apple", "banana", "kiwi", "watermelon", "orange");

  // searchFruit -> return Optional
  public static Optional<String> findFirstFruit(char targetChar) {
    return fruitDatabase.stream() //
        .filter(e -> e.contains(String.valueOf(targetChar))) //
        .findFirst();
  }

  public static Optional<Integer> searchFruit(List<String> fruitList,
      String target) {
    if (fruitList == null)
      throw new IllegalArgumentException("Fruit list should not be null");
    for (int i = 0; i < fruitList.size(); i++) {
      if (fruitList.get(i).equals(target))
        return Optional.of(i);
    }
    return Optional.empty();
  }

  public static void main(String[] args) {
    // usage
    Optional<Integer> foundFruit = searchFruit(fruitDatabase, "kiwi");
    foundFruit.ifPresent(e -> {
      System.out.println(fruitDatabase.get(e));
    });

    findFirstFruit('n').ifPresent(e -> {
      System.out.println(e); // banana
    });

  }
}
