import java.util.Optional;

public class DemoOptional {
  // ! Find

  public static void main(String[] args) {
    Optional<Integer> integerBox = Optional.of(10);
    // ! 1. isPresent()
    if (integerBox.isPresent()) {
      System.out.println("1: " + integerBox.get());
    }

    // Optional<Integer> integerBox2 = Optional.of(null); // will give error
    Integer x = null;
    Optional<Integer> integerBox2 = Optional.ofNullable(x); // constructor

    if (!integerBox2.isPresent()) {
      System.out.println("Value doesn't exist");
    }

    // ! 2. ifPresent(), consumer
    System.out.println("2.");

    integerBox.ifPresent(e -> {
      System.out.println(e);
    });

    // ! The only correct way to use Optional
    Optional<Integer> index = searchIndex(new int[] {10, 9, 4, 3, 5}, 1);
    // ! Optional -> Safe (Avoid Null Pointer Exception)
    if (index.isPresent()) {
      System.out.println("Found. Index=" + index.get());
    } else {
      System.out.println("Not found");
    }

    // ! 3. orElse
    int result = integerBox.orElse(-1);
    System.out.println("3: " + result);

    // ! 4. orElseGet()
    result = integerBox.orElseGet(() -> -1);
    System.out.println("4: " + result);

    // ! 5. orElseThrow()
    result = integerBox.orElseThrow(() -> new RuntimeException("Not Found."));
    System.out.println("5: " + result);

  }

  // ! Optional is just for method return type
  public static Optional<Integer> searchIndex(int[] numberList, int target) {
    // validation
    if (numberList == null)
      throw new IllegalArgumentException("numberList should not be null");
    for (int i = 0; i < numberList.length; i++) {
      if (numberList[i] == target) {
        return Optional.of(i); // findFirst
      }
    }
    return Optional.empty(); // constructor -> null value inside the box
  }


  // ! Incorrect ways to use Optional
  public static Optional<Integer> searchIndex2(Optional<Integer[]> numberList,
      int target) {
    if (numberList != null && numberList.isPresent()) { // Null check 2 times
      Integer[] numbers = numberList.get();
      for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == target) {
          return Optional.of(i); // findFirst
        }
      }
      return Optional.empty();
    }
    throw new IllegalArgumentException("numberList should not be null");
  }


}
