public class DemoWrapper2 {
  public static void main(String[] args) {
    // The ways to create Integer object
    Integer x = 3;
    Integer x2 = new Integer(3);
    Integer x3 = Integer.valueOf(3);

    // Double object
    Double d1 = 4.5;
    Double d2 = new Double(4.5);
    Double d3 = Double.valueOf(4.5);

    // String object (non-wrapper class)
    String s1 = "hello";
    String s2 = new String("hello");
    String s3 = String.valueOf("hello");

    //
    Integer i1 = Integer.valueOf(127);
    Integer i2 = Integer.valueOf(127);
    System.out.println(i1.equals(i2)); // true
    System.out.println(i1 == i2); // true: same address

    Integer i3 = Integer.valueOf(128);
    Integer i4 = Integer.valueOf(128);
    System.out.println(i3.equals(i4)); // true
    // ! "==" -> check if i3 has the same address as i4
    System.out.println(i3 == i4); // false: different addresses

    // i1 -> 127 <- i2
    // i3 -> 128, 14 -> 128
    // .valueOf()
    // stack memory: i1, i2, i3, i4
    // heap memory: 127, 128, 128
    // only have one memory of 127, have two for 128
    // except for new Integer

    // ! new -> force to create new object
    Integer i5 = new Integer(127);
    Integer i6 = new Integer(127);
    System.out.println(i5.equals(i6)); // true
    System.out.println(i5 == i6); // false
  }
}
