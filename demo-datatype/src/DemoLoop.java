public class DemoLoop {
  public static void main(String[] args) {
    // for (initialization; criteria to continue; modifier)
    int x = 3;
    // bad: for (int i = 1; i <= 4; i++)
    // i = 0 useful for index
    // start with i=0 unless i is useful (not a dummy a variable)
    // for (int i = 0; i < 4; i++), only adjust i < n
    for (int i = 0; i < 4; i++) {
      x *= 3;
    }
    System.out.println(x); // 3^5 = 243

    // Step 1: i = 0
    // Step 2: i < 4? Yes
    // Step 3: x *= 3

    // Step 4: i++, i -> 1
    // Step 5: i < 4? Yes
    // Step 6: x *= 3

    // Step 7: i++, i -> 2
    // Step 8: i < 4? Yes
    // Step 9: x *= 3

    // Step 10: i++, i -> 3
    // Step 11: i < 4? Yes
    // Step 12: x *= 3

    // Step 13: i++, i -> 4
    // Step 14: i < 4? No -> exit loop

    // print hello 50 times
    for (int i = 0; i < 50; i++) {
      System.out.println("Hello ");
    }

    // print even numbers in 0 - 100
    for (int i = 0; i <= 100; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // 0 - 20: print odd numbers and number > 5
    for (int i = 0; i <= 20; i++) {
      // if (i % 2 > 0 && i > 5) { // slower as i > 5 has less cases than odd numbers in 0-20
      if (i > 5 && i % 2 > 0 ) {      
        System.out.println(i);
      }
    }

    // Leap year
    // Divided by 100, not a leap year, unless divided by 400
    // e.g. 2000 is a leap year and 2100 is not, 2004 is a leap year
    // Leap year if divisible by 100 and 400
    // or if not a multiple of 100, then divisible by 4 
    int year = 2000;
    boolean isLeapYear = false;
    // if (year % 100 == 0) {
    //   if (year % 400 == 0) {
    //     isLeapYear = true;
    //   }
    // } else if (year % 4 == 0) {
    //   isLeapYear = true;
    // }

    // if (year % 4 == 0) {
    //   if (year % 100 > 0) {
    //     isLeapYear = true;
    //   } else {
    //     if (year % 400 == 0) {
    //       isLeapYear = true;
    //     }
    //   }
    // } 

    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          isLeapYear = true; // 2000
        } 
      } else {
        isLeapYear = true; // 2004
      }
    }
    System.out.println("Leap year? " + isLeapYear);

    isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0); 

    System.out.println("Leap year? " + isLeapYear);

    // Sum up 1 - 100
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }
    System.out.println("1 + 2 + ... + 100 = " + sum);

    // the number of values divided by 6 between 1 - 100
    int count = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 6 == 0) {
        count++;
      }
    }
    System.out.println("Number of 6 multiples from 1 - 100: " + count);

    // System.out.println(i); // error: i is declared within for loop (independent code block)

    // convert 1 - 100 to char values, then concat them together
    String Hundred = "";
    for (int i = 1; i <= 100; i++) {
      Hundred += (char) i; // String + any type of value -> String
    }
    System.out.println("Characters from 1 - 100: " + Hundred);
  }
}
