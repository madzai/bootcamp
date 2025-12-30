package demo-exception.src;

public class BusinessRuntimeException extends RuntimeException {
  private int code;

  public static BusinessRuntimeException of(SysCode sysCode) {
    return new BusinessRuntimeException(sysCode);
  }

  public BusinessRuntimeException(SysCode sysCode) {
    super(sysCode.getMessage());
    this.code = sysCode.getCode();
  }

  public int getCode() {
    return this.code;
  }

  public static class ArrayIndexOutOfRange extends RuntimeException {

  }

  public static void main(String[] args) {
    // ! Exception Polymorphism
    try {
      int[] arr = new int[3];
      arr[-1];
      // RuntimeException is seldom used (checking is not required), unless for re-throw
    } catch (RuntimeException e) { // Animal
      // ! RuntimeException is the parent of ArrayIndexOutOfBoundsException
      if (e instanceof ArrayIndexOutOfBoundsException) { // Tiger
        throw new ArrayIndexOutOfRange();
      }
    }





  }
}
