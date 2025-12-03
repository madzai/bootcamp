public class DemoOperator {
  public static void main(String[] args) {
    // +1, -1
    int x = 3;
    x = x + 1;
    x += 1;
    x++;
    ++x;
    System.out.println("x = " + x);

    int y = 8;
    y = y - 1;
    y -= 1;
    y--;
    --y;
    System.out.println("y = " + y);

    // +2
    int a = 9;
    a = a + 2;
    a += 2;
    System.out.println("a = " + a);

    a *= 2;
    System.out.println("a = " + a);
    a /= 2;
    System.out.println("a = " + a);

    // Difference between ++i and i++
    int j = 11;
    System.out.println(++j * 8);  // 12*8 (++ first, then *8)
    System.out.println(j); // 12

    int k = 11;
    System.out.println(k++ * 8); // 11*8 (*8 first, then ++)
    System.out.println(k); // 12

    int h = 14;
    h = h++ * 2 * ++h; // 14 * 2 * 16 = 448
    // Step 1: 14 * 2
    // Step 2: h becomes 15 after h++
    // Step 3: 28 * (15 + 1)
    System.out.println("h = " + h);

    // Operator !
    int age = 66;
    boolean isElderly = age > 65;
    System.out.println("isElderly = " + isElderly);
    age -= 10;
    System.out.println("isElderly = " + isElderly);
    isElderly = age > 65;
    System.out.println("isElderly = " + isElderly);

    if (isElderly == true) {

    }

    // more meaningful than if (age > 65)
    if (isElderly) {

    }

    // Check if NOT elderly
    if (!isElderly) {

    }

  }
}
