import java.math.BigDecimal;
import java.math.RoundingMode;

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

    // 0.25123 * 0.15
    System.out.println();
    System.out.println("0.25123 * 0.15: " + (0.25123 * 0.15));
    double x = 0.25123;
    double y = 0.15;
    System.out.print("0.25123 * 0.15 (rounded half up): ");
    System.out.println(BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(y))
        .setScale(2, RoundingMode.HALF_UP).doubleValue()); // 0.04

    System.out.println(BigDecimal.valueOf(0.5).multiply(BigDecimal.valueOf(0.5))
        .setScale(1, RoundingMode.HALF_DOWN).doubleValue()); // 0.25 -> 0.2

    // Chain method: 0.2 * 0.1 - 0.4 + 3.5
    // BigDecimal x1 = BigDecimal.valueOf(0.2);
    // BigDecimal x2 = BigDecimal.valueOf(0.1);
    // BigDecimal x3 = BigDecimal.valueOf(0.4);
    // BigDecimal x4 = BigDecimal.valueOf(3.5);
    // BigDecimal result4 = x1.multiply(x2).subtract(x3).;
    double r = BigDecimal.valueOf(0.2) //
        .multiply(BigDecimal.valueOf(0.1)) //
        .subtract(BigDecimal.valueOf(0.4)) //
        .add(BigDecimal.valueOf(3.5)) //
        .doubleValue();
    System.out.println("0.2 * 0.1 - 0.4 + 3.5 = " + r); // 3.12

    // Divide
    // / zero
    // non-termineated decimal places (i.e. 3.333333)
    System.out.println(
        BigDecimal.valueOf(9).divide(BigDecimal.valueOf(3)).doubleValue()); // 3.0
    System.out.println(
        BigDecimal.valueOf(9).divide(BigDecimal.valueOf(2)).doubleValue()); // 4.5

    // ! Non-terminating Decimal Expansion
    System.out.println(BigDecimal.valueOf(10)
        .divide(BigDecimal.valueOf(3), 2, RoundingMode.HALF_UP).doubleValue()); // 3.33

    // ! / zero
    int count = 0;
    int totalScore = 234;
    double averageScore = 0;
    if (count == 0) {
      averageScore = 0;
    } else {
      averageScore = BigDecimal.valueOf(totalScore)
          .divide(BigDecimal.valueOf(count), 2, RoundingMode.HALF_UP)
          .doubleValue();
    }
    System.out.println("Average Score: " + averageScore);

    // ! double * double -> floating point issue
    // ! int * double -> floating point issue
    int quantity = 3;
    double price = 99.9; // Java stores 99.89999... (binary problem)
    System.out.println("quantity * price = " + quantity * price); // 299.70000000000005
    // solution
    System.out.println("quantity * price = " + BigDecimal.valueOf(quantity)
        .multiply(BigDecimal.valueOf(price)).doubleValue()); // 299.7

  }
}
