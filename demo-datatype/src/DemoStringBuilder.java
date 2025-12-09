import java.math.BigDecimal;

public class DemoStringBuilder {
  public static void main(String[] args) {
    // StringBuilder is mutable, append() is a method to change its value
    StringBuilder sb = new StringBuilder(); // "" empty string
    sb.append("abc"); // concat()
    System.out.println("sb: " + sb); // abc
    sb.append("!!!"); // concat()
    System.out.println("sb: " + sb); // abc!!!

    // s2 is a new string object
    String s = "hello";
    String s2 = s.concat("!!!");
    System.out.println("s2: " + s2); // hello!!!
    System.out.println("s: " + s); // hello

    // Compare StringBuilder and String performance

    // ! String test
    long before = System.currentTimeMillis();
    String x = "";
    for (int i = 0; i < 100_000; i++) {
      x += 'a';
    }
    long end = System.currentTimeMillis();
    System.out.println(x.length()); // 100_000
    System.out.println("String concat time: " + (end - before)); // 671 ms for 100_000 times, 21 ms for 10_000 times

    // ! StringBuilder test
    before = System.currentTimeMillis();
    StringBuilder sb2 = new StringBuilder();
    for (int i = 0; i < 100_000; i++) {
      sb2.append("a");
    }
    end = System.currentTimeMillis();
    System.out.println("StringBuilder append time: " + (end - before)); // 2 ms for 100_000 times, 0 ms for 10_000 times

    // ! No big difference if you just concat the string once only
    String webUrl = "https://";
    webUrl += "www.apple.com";

    // Other methods
    System.out.println(sb2.length());
    System.out.println(sb2.charAt(0));
    System.out.println(sb2.isEmpty());
    System.out.println(sb2.indexOf("a"));
    System.out.println(sb2.substring(0, 3));

    // !!!! reverse
    String input = "hello";
    // String reversed = new StringBuilder(input).reverse().toString();
    // System.out.println("Reversed: " + reversed);
    StringBuilder sb4 = new StringBuilder(input);
    sb4.reverse();
    System.out.println("Reversed: " + sb4); // olleh

    // !!!! deleteCharAt
    StringBuilder sb3 = new StringBuilder(input);
    sb3.deleteCharAt(3);
    System.out.println("sb3: " + sb3); // helo

    double d1 = 0.2;
    double result =
        BigDecimal.valueOf(d1).multiply(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println("Result: " + result);

  }
}
