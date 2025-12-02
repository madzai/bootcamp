public class DemoPrimitive {
  public static void main(String[] args) {
    // ! Declaration (declare the type of x: integer)
    // ! Assignment (assign value 3 into x)
    int x = 3;
    System.out.println("\nInteger:");
    System.out.println(x);
    // ! Re-assignment: replace the box value by 100
    x = 100;
    System.out.println(x);

    x = -500;
    System.out.println(x);

    // Number with decimal
    double y = 3.14159;
    double z = 3.0;
    // ! Assign 10 (int) into double box, convert 10 to 10.0
    double a = 10; 
    System.out.println("\nDouble:");
    System.out.println(y);
    System.out.println(z);
    System.out.println(a); // print 10.0

    // ! Can't assign decimal number into integer box
    // int k = 10.5;

    // char (character) 0 - 65535, enough to cover all human languages
    char h = 'e';
    System.out.println("\nCharacter:");
    System.out.println(h);
    //re-assign value k
    h = 'k';
    System.out.println(h);

    // ! sysout (vs code)

    // boolean
    boolean isElderly = true;
    boolean isMarried = false;
    System.out.println("\nBoolean:");
    System.out.println("Is elderly: " + isElderly);
    System.out.println("Is married: " + isMarried);

    // Integer: int, byte, short, long
    // java will check 127 is in the range of byte (exception)
    byte b1 = 127; // 1 byte, -128 to 127
    // byte b2 = 128; // out of range
    // byte b3 = 129; // out of range

    // ! 32767 is an int value
    // ! There is no byte value and short value in Java
    // java will check assigned values for short and byte (exception)
    short s1 = 32767; // 2 bytes, -32,768 to 32,767
    // short s1 = 32768; // out of range
    short s2 = -32768; 

    // ! in real life, use use int for integer by default
    int i1 = 2_100_000_000; // 4 bytes, -2,147,483,648 to 2,147,483,647
    // int i2 = 2_200_000_000; // out of range

    // long -> 2^63
    // Assign int value into long box
    long l1 = 1270; // OK
    // Assign long value into int box (NOK)
    // int i7 = 1270L; // error
    long i8 = 555l; // OK: but may be confused as 5551

    // Decimal number: float, double
    // 3.5 (double value) -> float box (unsafe)
    // float f1 = 3.5; // error: java thinks 3.5 is double by default, i.e. too large for float
    double d1 = 3.5;
    // float f1 = d1; // unsafe

    // ! 3.5f is a float value
    // ! 3.5 is a double value
    // ! 3.5d is a double value
    // Assign float value into float box
    float f2 = 3.5f; // safe
    double d2 = 3.5f; // safe: assign float value into double box

    // Declaration
    int j;
    // System.out.println(j); // ! Can't read the box without assigning value (compile error)
    // Assign
    j = 10;
    System.out.println(j);

  }
}
