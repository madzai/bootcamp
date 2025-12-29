// ! Java: Exception Class or Normal Class
// Exception.class has an attribute, called "message"
// 1. Unchecked Exception (Parent -> RuntimeExeption.class)
// Java Built-in RuntimeException: ArrayIndexOutofBound, ... etc
// Compile-time has NO checking for RuntimeException

// 2. Checked Exception (Parent -> Exception.class)
// throw checked exception object, method signature has "throws"
// method callers has to try-catch for recovery
// e.g. useful for opening a file or connecting to a database
public class BusinessException extends Exception { // ! checked exception
  // public class BusinessException extends RuntimeException { // no need to try, catch?
  private int code;

  public static BusinessException of(SysCode sysCode) {
    return new BusinessException(sysCode);
  }

  private BusinessException(SysCode sysCode) {
    super(sysCode.getMessage());
    this.code = sysCode.getCode();
  }

  public int getCode() {
    return this.code;
  }

  public static void main(String[] args) {
    // fullName("John", "Wong"); // unhandled Exception (requires try-catch for checked exception)
    try {
      fullName("John", null);
    } catch (BusinessException e) {
      System.out.println(e.getMessage());
    }

    int[] arr = new int[] {3, 4};
    // System.out.println(arr[-1]); // runtime exception, try-catch is not required
  }

  public static String fullName(String firstName, String lastName)
      throws BusinessException {
    if (firstName == null || lastName == null)
      // throw new BusinessException(SysCode.NULL_PARAM); // using constructor: not used today
      throw BusinessException.of(SysCode.NULL_PARAM);
    return firstName + " " + lastName;
  }
}
