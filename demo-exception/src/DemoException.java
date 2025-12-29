public class DemoException {
  public static void main(String[] args) {
    // Java
    // 1. Class & Object (return)
    // 2. Exception Object (throw)

    // 1. ArrayIndexOutOfBound
    int[] arr = new int[] {3, 4};
    // System.out.println(arr[-1]); // ! Runtime error
    // System.out.println(arr[2]); // ! Runtime error
    // System.out.println(arr[arr.length]); // ! Runtime error

    // 2. StringIndexOutOfBounds
    String s = "hello";
    // System.out.println(s.charAt(-1)); // ! Runtime error
    // System.out.println(s.charAt(s.length())); // ! Runtime error

    // 3. NullPointerException (NPE)
    String input = null;
    // System.out.println(firstChar(input)); // ! Runtime error

    // 4. IllegalArgumnetException
    System.out.println(fullName("John", "Wong")); // method caller -> return "John Wong"

    String lastName = null;
    // recovery
    try {
      System.out.println("Check point 1"); // printed
      System.out.println(fullName("John", lastName)); // method caller -> return exception object
      System.out.println("Check point 2"); // not printed if error
    } catch (IllegalArgumentException e) { // ! e -> Exception Object Reference
      // recovery action ...
      System.out
          .println("Recover fullName Exception. message=" + e.getMessage()); // printed
    }
    System.out.println("End of Program...");

    // 5. NumberFormatException
    try {
      Integer userInput = Integer.valueOf("100"); // OK
      userInput = Integer.valueOf("100hello"); // NumberFormatException
    } catch (NumberFormatException e) {
      System.out.println("Recovery action for NumberFormatException");
    }

    // 6. ArithmeticException
    int count = 0;
    int totalAmount = 12300;
    // In practice, use if else to avoid divided by zero error (can be avoided by developer alone)
    try {
      double averageAmount = totalAmount / count;
      // ! Divided by 0.0 -> No Exception (give Infinity)
      System.out.println("Average amount: " + averageAmount);
    } catch (ArithmeticException e) {
      System.out.println("Count cannot be 0");
    }

  }

  public static String fullName(String firstName, String lastName) {
    if (firstName == null || lastName == null) {
      throw new IllegalArgumentException(
          "I'm going to die. This is my last message. firstName and lastName should not be null");
    }
    return firstName + " " + lastName;
  }

  public static char firstChar(String s) {
    return s.charAt(0); // NullPointerException (NPE) if s is null
    // return s != null ? s.charAt(0) : ' '; // not best practice to return ' ' for error
  }

  public static int sum(int x, int y) {
    return x + y;
  }
}
