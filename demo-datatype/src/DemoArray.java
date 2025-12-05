public class DemoArray {
  public static void main (String[] args) {
    // Array - store a set of same type values
    // arr is a variable name
    // "int[] arr" is to describe the type of the variable
    int[] arr = new int[4]; // auto-allocate appropriate memory location (for 4 consecutive blocks in this case)
    arr[0] = 23; // read & write, address of arr[0] is stored
    arr[1] = 49; // address of arr[i] is calculated based on address of arr[0]
    arr[2] = 71;
    arr[3] = 100;
    // arr[4] = -2; // error: ArrayIndexOutOfBoundsException

    System.out.println("Array length: " + arr.length);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    // arr = new int[4];
    // System.out.println("Array length: " + arr.length);
    // for (int i = 0; i < arr.length; i++) {
    //   System.out.println(arr[i]);
    // }

    // String[]
    // apple, banana, kiwi
    // for loop
    String[] arr2 = new String[3];
    arr2[0] = "apple";
    arr2[1] = "banana";
    arr2[2] = "kiwi";
    System.out.println();
    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }

    // char[]
    // i j k a b
    char[] arr3 = new char[5];
    arr3[0] = 'i';
    arr3[1] = 'j';
    arr3[2] = 'k';
    arr3[3] = 'a';
    arr3[4] = 'b';

    System.out.println();
    for (int i = 0; i < arr3.length; i++) {
      System.out.println(arr3[i]);
    }

    // boolean[]
    // true, false, true
    boolean[] arr4 = new boolean[3];
    arr4[0] = true;
    arr4[1] = false;
    arr4[2] = true;
    System.out.println();
    for (int i = 0; i < arr4.length; i++) {
      System.out.println(arr4[i]);
    }

    // "John", "Tommy", "Steven"
    String[] names = new String[] {"John", "Tommy", "Steven"};
    System.out.println();
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

  }
}
