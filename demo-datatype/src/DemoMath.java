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

    int result = 10 / 3; // 3: floor of division
    System.out.println("int: 10 / 3 = " + result);

    double result1 = 10 / 3; // 3: floor of division
    System.out.println("double: 10 / 3 = " + result1);

    double result2 = 10 / 3.0; // 3.3333...
    System.out.println("double: 10 / 3.0 = " + result2);

    int englishScore = 87;
    int mathScore = 72;
    int historyScore = 34;
    // Step 1: int + int + int -> int answer 64
    // Step 2: assign int value value into double box -> 64.0
    // double averageScore = (englishScore + mathScore + historyScore) / 3; // 64.0
    // System.out.println(averageScore);

    // Solution 1
    double averageScore =
        (double) (englishScore + mathScore + historyScore) / 3; // 64.3333
    // Solution 2: divide by double number 3.0
    // double averageScore = (englishScore + mathScore + historyScore) / 3.0; // 64.3333
    // Solution 3: double data type instead of int for the three scores upon declaration
    System.out.println(averageScore);

    // System.out.println(10 / 0); // error

    // 0.1 + 0.2
    System.out.println(0.1 + 0.2); // 0.30000000000000004 problem with binary operation
    double d1 = 0.1;
    double d2 = 0.2;
    double d3 = d1 + d2;
    System.out.println(d3);
    System.out.println(0.2 + 0.2); // 0.4

    // ! Never use double variables for Math operations e.g. + - * /
    // ! Solution: BigDecimal class

    // ! Overflow (no error)
    int i10 = 2_100_000_000;
    int i11 = 100_000_000;
    System.out.println(i10 + i11); // -2094967296 = lower limit + extra value above upper limit 2_147_483_647
    // ! For primitive (int, long), it will not be error after Math operation, even if it exceeds the range

    long l10 = i10 + i11;
    System.out.println(l10); // -2094967296

    // ! Step 1: int + long -> long (no overflow)
    // ! Step 2: assign long value into long variable
    long l11 = i10 + (long) i11; // or i10 + 100_000_000L;
    System.out.println(l11); // 2200000000

    // char -> int (ASCII)
    int v = 97;
    char n = 'a';
    int v2 = n;
    System.out.println("v2: " + v2);

    // A
    char n2 = 'A';
    int v3 = n2;
    System.out.println("v3: " + v3);

    int v5 = 20320;
    // ! Cannot assign higher level value into lower level type
    // char c20 = v5; // error: can't assign int value into char box directly

    // 65 -> A
    int v11 = 'A'; // char -> int 65
    char n3 = (char) v11;
    System.out.println("v11: " + v11);
    System.out.println("n3: " + n3);
    System.out.println("v11 + 3: " + (v11 + 3));

    int v12 = 65535 + 100;
    char n4 = (char) v12; // overflow
    System.out.println("char overflow " + (v12 - 65535) + ": " + n4);
    System.out.println((char) (65620 - 65535));
    System.out.println((int) (n4));

    int v6 = (int) 10L; // 自負盈虧, overflow for e.g. 2,200,000,000
    int v7 = (int) 2_200_000_000L;
    System.out.println("10: " + v6);
    System.out.println("2_200_000_000L = " + v7 + " in integer");
  }
}
