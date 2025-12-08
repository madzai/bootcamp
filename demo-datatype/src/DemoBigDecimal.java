import java.math.BigDecimal;

public class DemoBigDecimal {
  public static void main(String[] args) {
    // 0.2 + 0.1
    System.out.println("0.2 + 0.1: ");
    System.out.println("Not BigDecimal: " + (0.2 + 0.1)); // 0.30000000000000004
    BigDecimal bd1 = BigDecimal.valueOf(0.2);
    BigDecimal bd2 = BigDecimal.valueOf(0.1);
    BigDecimal result = bd1.add(bd2);

    System.out.println("BigDecimal .add: " + result); // 0.3
    System.out.println("Double value: " + result.doubleValue()); // 0.3
    System.out.println("Long value: " + result.longValue()); // 0

    // 0.3 - 0.1
    System.out.println();
    System.out.println("0.3 - 0.1: ");
    System.out.println("Not BigDecimal: " + (0.3 - 0.1));
    BigDecimal bd3 = BigDecimal.valueOf(0.3);
    BigDecimal bd4 = BigDecimal.valueOf(0.1);
    BigDecimal result2 = bd3.subtract(bd4);
    System.out.println("BigDecimal .subtract: " + result2);
    System.out
        .println(BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1)));
    System.out.println("Double value: " + result2.doubleValue());

    // 0.1 * 0.2
    System.out.println();
    System.out.println("0.1 * 0.2: ");
    System.out.println(0.1 * 0.2); // 0.020000000000000004
    BigDecimal bd5 = BigDecimal.valueOf(0.1);
    BigDecimal bd6 = BigDecimal.valueOf(0.2);
    BigDecimal result3 = bd5.multiply(bd6);
    System.out.println("BigDecimal .multiply: " + result3);
    System.out.println("Double value: " + result3.doubleValue());

  }
}
