public class DemoMath {
  // main + Enter (vs code)
  public static void main(String[] args) {
    // + - * / %
    // % remainder of division
    int remainder = 10 % 3;
    System.out.println(remainder);

    remainder = 99 % 7;
    System.out.println(remainder);

    // int
    int a = 7;
    System.out.println(a + 9);
    System.out.println(a - 3);
    System.out.println(a * 8);
    System.out.println(a / 7);

    // Step 1: a + 10 -> 17 (int + int -> int value)
    // Step 2: Assign int value (17) into int box
    a = a + 10;
    System.out.println(a);

    // right -> left
    // Step 1: int + double
    // Step 2: assign double value into double box
    int b = 8;
    System.out.println(b + 3.5d); // int + double -> double value
    double r = b + 3.5d; // assign double value into double box
    System.out.println("r = " + r);

    // ! Operation between higher level type and lower level type -> Result is higher level type
    long k = 3 * 100L;
    // int t = 3 * 100L; // int * long -> long value (NOK), can't assign to int box

    // level: byte -> short -> int -> long -> float -> double
    float f1 = 10L; // special case
    byte b10 = 9;
    short s10 = 9;
    // ! special case: byte + short -> int
    // short s20 = b10 + s10; 
    int s20 = b10 + s10;


    // char -> int
  }
}
